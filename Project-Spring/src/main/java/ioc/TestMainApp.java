package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainApp {
	public static void main(String[] args) {
//		Verizon vzon = new Verizon();
//		vzon.calling();
//		vzon.data();
	
//		Tmobile tmob = new Tmobile();
//		tmob.calling();
//		tmob.data();

//		Sim sim = new Verizon();
//		sim.calling();
//		sim.data();

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config Loaded");	
		
		Sim sim = context.getBean("sim", Sim.class); //Sim sim = new TMobile();
		sim.calling();
		sim.data();		
		
	}
}
