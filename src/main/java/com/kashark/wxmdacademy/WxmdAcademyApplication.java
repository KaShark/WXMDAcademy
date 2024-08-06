package com.kashark.wxmdacademy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@MapperScan("com.kashark.wxmdacademy.mapper")
@Configuration
public class WxmdAcademyApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxmdAcademyApplication.class, args);
	}

}
