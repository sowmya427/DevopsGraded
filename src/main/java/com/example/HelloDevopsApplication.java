package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloDevopsApplication.class, args);
		System.out.println("hello Devops");
	}

}
