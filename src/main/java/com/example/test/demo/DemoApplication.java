package com.example.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("initialization of the application");
		SpringApplication.run(DemoApplication.class, args);
	}

}
