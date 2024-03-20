package com.java.controlswitch;

public class Student {  
	public static void main(String[] args) {  
		byte marks = 60;  
		switch (marks){  
			case 60:  
				System.out.println("You Passed in First Class");  
				break;  
			case 80:  
				System.out.println("You Passed in Distinction");  
				break;  
			default:  
				System.out.println(marks);  
		}  
	}  
}
