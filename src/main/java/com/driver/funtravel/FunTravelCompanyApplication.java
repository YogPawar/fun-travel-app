package com.driver.funtravel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class FunTravelCompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FunTravelCompanyApplication.class, args);
	}

}
