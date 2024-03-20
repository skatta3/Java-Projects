package com.java.forloop;

public class Calculation {
	public static void main(String[] args) {  
		int i = 0;  
		
		//Basic for loop				
		for(int j = 1; j<=10; j++) {  
			i = i + j;  
			System.out.println("sum is : " + i);
		}  
		System.out.println("The sum of first 10 natural numbers is " + i);  
		
//		for(; ; ) {  
//			System.out.println("Executing Infinite For Loop");
//		}  
	}  
}
