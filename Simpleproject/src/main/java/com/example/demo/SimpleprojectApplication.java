package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@SpringBootApplication
@EnableAutoConfiguration
@RestControllerAdvice
@Component
public class SimpleprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleprojectApplication.class, args);
	}

}
