package com.advance_warn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.advance_warn.dao*")
public class AdvanceWarnApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvanceWarnApplication.class, args);
	}

}
