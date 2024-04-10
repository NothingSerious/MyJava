package org.example.myjavademo;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("org.example.myjavademo.employee.mapper")
public class MyJavaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyJavaDemoApplication.class, args);
	}


}
