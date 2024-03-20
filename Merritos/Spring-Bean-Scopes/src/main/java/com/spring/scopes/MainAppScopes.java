package com.spring.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppScopes {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-scope.xml");
		
		Employee emp1 = context.getBean("employee", Employee.class);
		emp1.SelectAllRows();
		context.registerShutdownHook();
	}
}
