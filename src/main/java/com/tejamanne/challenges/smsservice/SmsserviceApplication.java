package com.tejamanne.challenges.smsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class SmsserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsserviceApplication.class, args);
	}
}
