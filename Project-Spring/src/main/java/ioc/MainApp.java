package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {

		// Without Spring Framework
//		Verizon vzon = new Verizon();
//		vzon.calling();
//		vzon.data();
		
//		Tmobile tmob = new Tmobile();
//		tmob.calling();
//		tmob.data();
		
//		Sim sim = new Verizon();
//		sim.calling();
//		sim.data();
		
		//With Spring Framework
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Sim sim = (Sim) context.getBean("sim"); //Sim sim = new Verizon();
		sim.calling();
		sim.data();

	}

}
