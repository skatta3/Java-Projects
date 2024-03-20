package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
	/**
	 * STEP1:  Changing Complete code if we are switching between providers
	 */
			
//		Verizon vzon = new Verizon();
//		vzon.calling();
//		vzon.data();
//		
//		Tmobile tm = new Tmobile();
//		tm.calling();
//		tm.data();
		
		/**
		 * STEP 2: Using Interface Reference, We just changed the Instance of the 
		 * Class reference
		 */
		
//		Sim sim = new Tmobile();
//
//		sim.calling();
//		sim.data();
		
//		/**
//		 * STEP 3: Using Spring Configuration, No Changes in the code
//		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config Loaded");
		
		Sim sim = context.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
		
	}

}
