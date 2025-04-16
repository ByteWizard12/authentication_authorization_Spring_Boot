package com.example.authentication_and_authorization_Spring_Boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class AuthenticationAndAuthorizationSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationAndAuthorizationSpringBootApplication.class, args);
	}

}
