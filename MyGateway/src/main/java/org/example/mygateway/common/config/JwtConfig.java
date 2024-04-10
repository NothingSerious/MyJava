package org.example.mygateway.common.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lombok.Data;
import org.example.mygateway.common.HeaderUser;
import org.example.mygateway.common.constant.HeaderConstant;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.util.Date;

@RefreshScope
@ConfigurationProperties(prefix = "jwt")
@Data
public class JwtConfig {

    /**
     * 是否开启
     */
    @Value("${jwt.enabled}")
    private Boolean enabled;
    /**
     * 签名jwt的密令
     */
    private String signing;
    /**
     * token有效时长(秒)
     */
    private Long expiration;
    /**
     * token前缀
     */
    private String tokenHead;
    /**
     * header名称
     */
    private String header;

    /**
     * 生成token
     * @return
     */
    public HeaderUser parseUser(String token) {
        Claims claims;
        try {
            claims = Jwts.parser().setSigningKey(signing).parseClaimsJws(token).getBody();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

        Date expiration = claims.getExpiration();
        boolean expire = expiration.before(new Date());

        Long userId = claims.get(HeaderConstant.USER_ID, Long.class);
        String userName = claims.get(HeaderConstant.USER_NAME, String.class);

        return HeaderUser.builder().expires(expire).userId(userId).userName(userName).build();
    }
}