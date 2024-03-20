package com.java.controlIf;

public class StudentIf {
	public static void main(String[] args) {  
		int x = 10;  
		int y = 12;  
		
		int averageMarks = 80;
		if(averageMarks >= 35 && averageMarks <= 50) {  
			System.out.println("You have Passed");  
		} else if(averageMarks > 50 && averageMarks <= 60) {
			System.out.println("You have Passed in Second Grade");  
		} else if(averageMarks > 60) {
			System.out.println("You have Passed in First Grade");  
		} else {
			System.out.println("You ahve Failed, Better Luck Next Time!");
		}
		System.out.println("If loop is executed Successfully!");
	}  
}
