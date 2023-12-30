package com.animalsapp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.animalsapp.app", "com.animalsapp.controller"})
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}