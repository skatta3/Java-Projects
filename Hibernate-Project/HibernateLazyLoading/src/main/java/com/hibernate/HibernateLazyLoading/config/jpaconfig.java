package com.hibernate.HibernateLazyLoading.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.hibernate.HibernateLazyLoading.repository")
public class jpaConfig {

}