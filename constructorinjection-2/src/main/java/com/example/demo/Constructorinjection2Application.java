package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Constructorinjection2Application {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(Constructorinjection2Application.class, args);
		Laptop ref = ac.getBean(Laptop.class);
		ref.build();
	}

}
