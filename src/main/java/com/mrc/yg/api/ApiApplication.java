package com.mrc.yg.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan(basePackageClasses = ApiApplication.class)
@SpringBootConfiguration
@ComponentScan
@EnableScheduling // 주기적으로 publish 하기 위해 넣었음. Sender.class의 send() 메소드에 붙은 어노테이션 @Scheduled 참고.
public class ApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
}
