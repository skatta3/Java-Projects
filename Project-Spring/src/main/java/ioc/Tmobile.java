package com.spring.ioc;

public class Tmobile implements Sim{
	
	
	public void calling() {
		System.out.println("Calling using Tmobile sim");
		
	}


	public void data() {
		System.out.println("Browsing Internet using Tmobile sim");
		
	}
	
	public void displayMessage(String str) {
		System.out.println("The Message is: " + str);
	}

}
