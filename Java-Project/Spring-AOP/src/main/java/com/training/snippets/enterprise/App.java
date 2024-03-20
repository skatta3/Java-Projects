package com.training.snippets.enterprise;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			SimpleService simpleService = (SimpleService) context.getBean("simpleServiceProxy");
			
			simpleService.printNameId();
			System.out.println("--------------");
			try{
				simpleService.checkName();
			} catch(Exception e){
				System.out.println("SimpleService: Method checkName() exception thrown..");
			}
			System.out.println("--------------");
//			simpleService.sayHello("Welcome to Spring AOP");
			context.close();
	}
}
