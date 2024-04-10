package org.example.mygateway.common.config;

import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import java.util.List;

@Configuration
@RefreshScope
@ConfigurationProperties(prefix = "white.filter")
public class WhiteConfig {

    private PathMatcher pathMatcher = new AntPathMatcher();


    @Value("${white.filter.uri}")
    private List<String> uri;

    public boolean isCanAccess(String api) {
        return uri.stream().anyMatch(r -> pathMatcher.match(r, api));
    }
}