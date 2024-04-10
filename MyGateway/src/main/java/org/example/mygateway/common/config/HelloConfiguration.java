package org.example.mygateway.common.config;

import org.example.mygateway.filter.HelloFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfiguration {

    @Bean
    public HelloFilter helloFilter() {
        return new HelloFilter();
    }

}
