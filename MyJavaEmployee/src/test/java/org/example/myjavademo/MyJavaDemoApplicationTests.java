package org.example.myjavademo;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

@SpringBootTest
@MapperScan("org.example.myjavademo.mapper")
class MyJavaDemoApplicationTests {

	@Test
	void contextLoads() {
//		employeeMapper.selectById(1);
	}

}
