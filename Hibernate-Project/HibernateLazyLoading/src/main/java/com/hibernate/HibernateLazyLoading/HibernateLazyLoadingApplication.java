package com.hibernate.HibernateLazyLoading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.hibernatejpa.*")
@EntityScan("com.hibernate.HibernateLazyLoading.*")
public class SpringMain {
	public static void main(String[] args) {

        SpringApplication.run(SpringMain.class, args);
    }

}