package com.java.console;

import java.io.Console;  
class ConsoleExample{    
	public static void main(String args[]){    
		Console c=System.console();    
		System.out.println("Enter your name: ");    
		String n=c.readLine();    
		System.out.println("Welcome "+n);    
	}    
}  