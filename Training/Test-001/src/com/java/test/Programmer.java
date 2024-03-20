package com.java.test;

import java.io.IOException;

public class Programmer extends Employee {
	

	String skillSet;
	int exp;
	boolean relocate;
	
	public Programmer() {
		
	}
	
	
	//overriding method
	@Override
	public void getBonus() throws Exception{
		float bonus;  //Local Variable
		bonus =  1.5f;
		System.out.println("Bonus: "  + bonus);
	}
	
}
