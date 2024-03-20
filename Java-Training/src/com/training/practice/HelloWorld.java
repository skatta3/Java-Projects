package com.training.practice;

public class HelloWorld {
	// int is the data type, Number1 and Number2 are Variable names, ; is the end of the statement
	int Number1;
	int Number2;

	public static void main(String[] args) {
		System.out.println("Welcome to Java Training");
		
		// Instantiating HelloWorld class
		HelloWorld helloObject = new HelloWorld();
		
		// Printing Class Variables
		System.out.println("Number1...." + helloObject.Number1);
		System.out.println("Number2...." + helloObject.Number2);
		
		
	}

}
