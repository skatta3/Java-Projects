package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	int model;
	String manufacturer;
	float price;

	@Autowired
	@Qualifier("driverBean1")
	private Driver driver;
	
	public Car() {
//		System.out.println("Car Object is created");
	}
	

	public Car(Driver driver) {
		System.out.println("Car Object is created with argument Constructor");
		this.driver = driver;
	}
	
	
	@Override
	public String toString() {
		return ("Model : "  + model + " Manufacturer : " + manufacturer + " Price : " + price);
	}

	public Driver getDriver() {
		return driver;
	}


	public void setDriver(Driver driver) {
		System.out.println("Calling Setter Method to Inject Dependency");
		this.driver = driver;
	}
	
	public void Running() {
		if(driver != null) {
			System.out.println("The Driver is driving the Car");
		} else {
			System.out.println("No Driver");
		}
	}
}
