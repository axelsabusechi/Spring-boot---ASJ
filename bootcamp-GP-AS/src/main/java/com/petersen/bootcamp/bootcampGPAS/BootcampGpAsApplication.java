package com.petersen.bootcamp.bootcampGPAS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootcampGpAsApplication {

	public static void main(String[] args) {

		SpringApplication.run(BootcampGpAsApplication.class, args)
				.getBeanDefinitionNames();
	}

}
