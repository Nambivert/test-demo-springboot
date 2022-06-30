package com.srini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.srini"})
public class SampleWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleWebApplication.class, args);
	}

}
