package org.example.mygateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.URI;

/**
 * @program: springcloud-gateway
 * @description: 全局鉴权
 * @author: xm
 * @create: 2019-01-30 19:59
 **/
@Slf4j
public class HelloFilter implements GlobalFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        ServerHttpRequest request = exchange.getRequest();
        URI url = request.getURI();
        String host = url.getHost();
        String path = url.getPath();
        String query = url.getQuery();

        request.mutate().build();
        log.info("接收到请求: {} {} {}", host, path, query);

        return chain.filter(exchange);
    }

}
