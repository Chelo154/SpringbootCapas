package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.capas.infra.springboot")
public class ArquitecturaCapasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArquitecturaCapasApplication.class, args);
	}

}
