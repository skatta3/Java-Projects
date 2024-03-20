package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// Without Spring Framework
//		Verizon ver = new Verizon();
//		ver.calling();
//		ver.data();
		
//		Tmobile tmob = new Tmobile();
//		tmob.calling();
//		tmob.data();
		
//		Sim sim = new Verizon();
//		sim.calling();
//		sim.data();
		
		//With Spring Framework
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config Loaded");
		
		Sim sim = context.getBean("abc", Sim.class);  // Sim sim = new Tmobile();
		sim.calling();
		sim.data();
	}

}
