package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Myfood1Application {
	
	private static final Logger logger = LoggerFactory.getLogger(Myfood1Application.class);

	public static void main(String[] args) {
		
		SpringApplication.run(Myfood1Application.class, args);
		logger.info("My Spring Boot application has started.");
	}

}
