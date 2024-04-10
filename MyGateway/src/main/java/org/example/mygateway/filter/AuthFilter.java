package org.example.mygateway.filter;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.mygateway.common.HeaderUser;
import org.example.mygateway.common.Response;
import org.example.mygateway.common.config.JwtConfig;
import org.example.mygateway.common.config.WhiteConfig;
import org.example.mygateway.common.constant.HeaderConstant;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * @program: springcloud-gateway
 * @description: 全局鉴权
 **/
@Slf4j
@AllArgsConstructor
public class AuthFilter implements GlobalFilter, Ordered {

    private JwtConfig jwtConfig;
    private WhiteConfig whiteConfig;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        ServerHttpRequest request = exchange.getRequest();
        URI url = request.getURI();
        String host = url.getHost();
        String path = url.getPath();
        String query = url.getQuery();

        String authorization = authorization(exchange);
        log.info("Authorization: {}", authorization);

        // 白名单
        if (whiteConfig.isCanAccess(path)) {
            log.info("白名单鉴权成功: {} {} {}", host, path, query);
            return chain.filter(exchange);
        }

        // token检验
        if (StringUtils.isEmpty(authorization)) {
            log.info("鉴权失败: {} {} {}", host, path, query);
            return output401(exchange, HttpStatus.UNAUTHORIZED, "您离开太久了，请重新登录！");
        }

        HeaderUser user;
        try {
            user = jwtConfig.parseUser(authorization);
            log.info("user : [{}]", JSON.toJSONString(user));
            if (user.getExpires()) {
                log.info("鉴权失败, token已失效: {} {} {}", host, path, query);
                return output401(exchange, HttpStatus.UNAUTHORIZED, "您离开太久了，请重新登录！");
            }
            // 此处拓展黑名单逻辑，方案是业务系统在注销用户的时候把用户信息写到redis里面，该地方查询到即返回失败

        } catch (Exception e) {
            log.info("鉴权失败: {} {} {} {}", e.getMessage(), host, path, query, e);
            return output401(exchange, HttpStatus.UNAUTHORIZED, "您离开太久了，请重新登录！");
        }

        Consumer<HttpHeaders> httpHeaders = httpHeader -> {
            if (Objects.nonNull(user.getUserId())) {
                httpHeader.set(HeaderConstant.USER_ID, String.valueOf(user.getUserId()));
            }

            if (!StringUtils.isEmpty(user.getUserName())) {
                try {
                    httpHeader.set(HeaderConstant.USER_NAME, URLEncoder.encode(user.getUserName(), "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    log.error(e.getMessage(), e);
                }
            }
        };

        request.mutate().headers(httpHeaders).build();
        log.info("鉴权成功: {} {} {}", host, path, query);

        ServerWebExchange build = exchange.mutate().request(request).build();
        Mono<Void> mono = chain.filter(build).then(Mono.fromRunnable(() -> {
            log.info("请求成功");
        }));

        return mono;
    }

    /**
     * 获取token
     *
     * @param exchange
     * @return1
     */
    private String authorization(ServerWebExchange exchange) {
        ServerHttpRequest request = exchange.getRequest();
        HttpMethod method = request.getMethod();
        String authorization = request.getHeaders().getFirst(jwtConfig.getHeader());
        if (Objects.isNull(authorization) && HttpMethod.GET == method) {
            MultiValueMap<String, String> queryParams = request.getQueryParams();
            authorization = queryParams.getFirst(jwtConfig.getHeader());
        }

        if (Objects.isNull(authorization)) {
            return null;
        }

        String[] tokens = authorization.split(" ");

        if (tokens.length < 2) {
            return null;
        }

        if (!jwtConfig.getTokenHead().equals(tokens[0])) {
            return null;
        }
        return tokens[1];
    }

    /**
     * 鉴权失败输出
     *
     * @param exchange
     * @return
     */
    private Mono<Void> output401(ServerWebExchange exchange, HttpStatus status, String errorMessage) {
        ServerHttpResponse response = exchange.getResponse();
        response.setStatusCode(HttpStatus.OK);
        response.getHeaders().setContentType(MediaType.APPLICATION_JSON);
        Response mes = Response.error(status.value(), errorMessage);
        return response.writeWith(Mono.just(response.bufferFactory().wrap(JSON.toJSONString(mes).getBytes())));
    }

    @Override
    public int getOrder() {
        return 100;
    }
}
