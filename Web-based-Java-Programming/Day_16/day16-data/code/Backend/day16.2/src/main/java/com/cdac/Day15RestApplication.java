package com.cdac;


import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Day15RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day15RestApplication.class, args);
	}

	@Bean
	ModelMapper modelMapper() {
		System.out.println("Creating model mapper");
		return new ModelMapper();
	}
}
