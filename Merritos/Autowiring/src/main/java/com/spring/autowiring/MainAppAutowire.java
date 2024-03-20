package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppAutowire {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-autowire.xml");
		
		Car car = context.getBean("car", Car.class);
		car.model = 2020;
		car.manufacturer ="Hyundai";
		car.price = 800000.00f;
		
		System.out.println("First Car Information");
		System.out.println(car);
		
		System.out.println("-------------------------");
		
		Car car2 = context.getBean("car", Car.class);
		System.out.println("Second Car Information");
		System.out.println(car2);	

//		System.out.println("-------------------------");
//
//		Car car3 = context.getBean("car", Car.class);
//		System.out.println("Third Car Information");
//		System.out.println(car3);		
//	
//		System.out.println("-------------------------");
//
//		Car car4 = context.getBean("car", Car.class);
//		System.out.println("Fourth Car Information");
//		System.out.println(car4);		
		
//		car.Running();
	
	}
}
