package com.dyago.DiegoShopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DiegoShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiegoShoppingApplication.class, args);
	}

}
