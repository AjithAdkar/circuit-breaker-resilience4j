package com.ajith.circutebreaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CircutebreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircutebreakerApplication.class, args);
	}


	@Bean
	RestTemplate restTemplate(){
	return 	new RestTemplate();
	}
}
