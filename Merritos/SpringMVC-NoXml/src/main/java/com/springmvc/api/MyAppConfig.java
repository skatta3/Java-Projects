package com.springmvc.api;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.springmvc")
public class MyAppConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = 
				new InternalResourceViewResolver();
		viewResolver.setPrefix("WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
