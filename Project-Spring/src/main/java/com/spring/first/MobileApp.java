package com.spring.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileApp {
	public static void main(String[] args) {
//		Verizon vz = new Verizon();
//		vz.voiceCalling();
//		vz.sendTxtMessages();
		
//		TMobile tm = new TMobile();
//		tm.voiceCalling();
//		tm.sendTxtMessages();
		
//		Sim sm = new Verizon();
//		sm.voiceCalling();
//		sm.sendTxtMessages();
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		Sim sim = (Sim) ctx.getBean("sim1"); // Sim sim = new Verizon();
		sim.voiceCalling();
		sim.sendTxtMessages();
	}
}
