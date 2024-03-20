package com.spring.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainBean {

	public static void main(String[] args) {
//		Verizon vzon = new Verizon();
//		vzon.calling();
//		vzon.data();
		
//		Tmobile tmob = new Tmobile();
//		tmob.calling();
//		tmob.data();
	
		//Whenever we change the provider, we need to change the code, The other approach is using
		//Interface reference
		
//		Sim sim = new Verizon();
//		sim.calling();
//		sim.data();

	      
	    BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");

//		Verizon ver = (Verizon) factory.getBean("verizon");
//		ver.calling();
//		ver.data();
		
	// Use Reference Variable Sim not to change any cod ein Java
		
		Sim sim = factory.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
////		
////		Sim sim1 = context.getBean("sim", Sim.class);
	}

}
