package com.adidas.publicservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Public application. Microservice to be used by UI frontend.
 *
 */
@SpringBootApplication
@EnableConfigurationProperties
public class PublicApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublicApplication.class, args);
	}

}
