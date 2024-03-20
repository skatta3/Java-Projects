package com.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com")
public class MyAppConfig {
	@Bean
	InternalResourceViewResolver ViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	//DB Connection
//	@Bean
//	DataSource dataSource() {
//		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/training");
//		driverManagerDataSource.setUsername("root");
//		driverManagerDataSource.setPassword("admin");
//		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		
//		return driverManagerDataSource;
//	}
}
