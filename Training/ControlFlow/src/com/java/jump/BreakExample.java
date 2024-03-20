package com.java.jump;

public class BreakExample {  
	public static void main(String[] args) {  
		
		for(int i = 0; i<= 10; i++) {  
			System.out.println(i);  
			if(i==6) {  
				break;  
			}  
		} 
		
		System.out.println("Used the break statement");
	}  
}  