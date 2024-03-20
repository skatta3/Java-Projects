package com.jpa.springbooth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.jpa.controller","com.jpa.service"})
@EntityScan("com.jpa.entity")
@EnableJpaRepositories("com.jpa.repository")
@SpringBootApplication
public class SpringbootH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootH2Application.class, args);
	}

}


