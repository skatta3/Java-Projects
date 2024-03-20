package com.java.jump;

public class ContinueExample {  
	public static void main(String[] args) {  
//		for(int i = 0; i<= 2; i++) {  
//			for (int j = i; j<=5; j++) {  
//				if(j == 4) {  
//					continue;  
//				}  
//				System.out.println(j);  
//			}  
//		}  
		
		
		for (int j = 1; j<=5; j++) {  
			if(j == 4) {  
				continue;  // Skips the Current iteration and continue teh next iteration
			}  
			System.out.println("Continue Statement Example");  
			System.out.println(j);  
		}  
	}  
}  
