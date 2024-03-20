package com.java.Annotations;

import java.util.Date;

/* Java program to demonstrate that annotations are 
not barely comments (This program throws compiler 
error because we have mentioned override, but not 
overridden, we have overloaded display) */
class Base 
{ 
	public void display() 
	{ 
		System.out.println("Base display()"); 
	} 
} 
public class Derived extends Base 
{ 
	
	private int j;
	
	@Override
	public void display() 
	{ 
		System.out.println("Derived display(int )"); 
	} 

	public static void main(String args[]) 
	{ 
		Derived obj = new Derived(); 
		obj.display(); 
	} 
	
	@SuppressWarnings("deprecation")
	public void foo() {
		int j = 5;
		
		System.out.println("Value of j: " + j);
		
		Date d = new Date();
		d.getDay();
	}
}
