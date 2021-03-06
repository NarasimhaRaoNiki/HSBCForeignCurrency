package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/**
	 * spring main method 
	 */
@SpringBootApplication
public class ForeignCurrencyApp {
	public static void main(String[] args) 
	{
		 SpringApplication.run(ForeignCurrencyApp.class, args);
	}
	
	@Bean 
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}	
}
