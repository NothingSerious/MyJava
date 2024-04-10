package org.example.myuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("org.example.myuser.user.mapper")
public class MyUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyUserApplication.class, args);
    }

}
