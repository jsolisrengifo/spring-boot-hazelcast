package com.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringBootHazelcastApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHazelcastApplication.class, args);
	}

}
