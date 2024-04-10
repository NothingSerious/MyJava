package org.example.mygateway.common.config;

import org.example.mygateway.filter.AuthFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@RefreshScope
@ConditionalOnProperty(name = "jwt.enabled", havingValue = "true")
@Import(JwtConfig.class)
public class AuthConfiguration {

    @Autowired
    private JwtConfig jwtConfig;

    @Autowired
    private WhiteConfig whiteConfig;


    @Bean
    public AuthFilter authFilter() {
        return new AuthFilter(jwtConfig, whiteConfig);
    }

}
