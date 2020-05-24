package com.example.atSys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.atSys"})
@MapperScan(basePackages = "com.example.atSys.dao")
//@ComponentScan(base)
public class AttendingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttendingSystemApplication.class, args);
	}

}
