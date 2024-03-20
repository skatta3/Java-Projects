package com.java.classes;

import java.util.Date;

public class SmartPhone {
	String model;
	String ScreenSize;
	String manufacturer;
	
	//Default Constructor
	public SmartPhone() {
		super();
		System.out.println("This is Default Constructor of the SmartPhone");
	}
	
	//Argument Constructor
	public SmartPhone(String model, String screensize,String manufacturer) {
		this.model = model;
		this.ScreenSize = screensize;
		this.manufacturer= manufacturer;
		System.out.println("This is Argument Constructor of the SmartPhone");

	}
	
	public void WiFi() {
		
	}
	
	public void GPS() {
		
	}
	
	public static void main(String[] args) {
		SmartPhone sphone1 = new SmartPhone(); //Identity
		//State of teh Object
		sphone1.model = "11";
		sphone1.ScreenSize = "6.7";
		sphone1.manufacturer="Samsung";
		//Behavior of the Object
		sphone1.WiFi();
		sphone1.GPS();
		
		SmartPhone sphone2 = new SmartPhone("9", "6", "google");
		
	//	SmartPhone sphone3 = (SmartPhone) Class.forName("com.java.classes.SmartPhone").newInstance();
		
//		SmartPhone sphone4 = (SmartPhone) sphone1.clone();
		
		System.out.println("Today's date is :" + new Date());
	}
}

class Tablet {
	
}

class Laptop {
	
}