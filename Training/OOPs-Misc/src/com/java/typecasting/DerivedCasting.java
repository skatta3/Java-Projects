package com.java.typecasting;

//Java program to demonstrate 
//Upcasting Vs Downcasting 

//Parent class 
class Employee { 
	String name = "Srinivas"; 

	// A method which prints the signature of the parent class 
	void method() 
	{ 
		System.out.println("Method from Employee"); 
	} 
} 

//Child class 
class Programmer extends Employee { 
	int id = 1; 

	// Overriding the parent method to print the signature of the child class 
	
	void childMethod() 
	{ 
		System.out.println("Method from Programmer"); 
	} 
} 

//Demo class to see the difference between upcasting and downcasting 
public class DerivedCasting { 

	// Driver code 
	public static void main(String[] args) 
	{ 
		// Upcasting 
		Employee emp = new Programmer(); 
		//emp.name = "Chris Soyars"; 

		System.out.println("----USE CASE 1--------UpCasting-------------");
		// This parameter is not accessible 
		// emp.id = 1; 
		System.out.println(emp.name); 
		emp.method(); 

		// Trying to Downcasting Implicitly 
	//	 Programmer pro = new Employee(); - > compile time error 

		// Downcasting Explicitly 
		Programmer pro = (Programmer)emp; 
		System.out.println("-----USE CASE 2------DownCasting----------------");
		pro.id = 1; 
		System.out.println(pro.name); 
		System.out.println(pro.id); 
		pro.childMethod();
		pro.method(); 
	} 
} 
