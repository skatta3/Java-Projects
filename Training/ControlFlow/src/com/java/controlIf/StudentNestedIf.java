package com.java.controlIf;

public class StudentNestedIf {
	public static void main(String[] args) {  
		String address = "Sayreville, Canada";  
		  
		if(address.endsWith("USA")) {  
			if(address.contains("Arizona")) {  
				System.out.println("Your city is Arizona");  
			}else if(address.contains("Delaware")) {  
				System.out.println("Your city is Delaware");  
			}else {  
				System.out.println(address.split(",")[0]);  
			}  
		}else {  
			System.out.println("You are not living in USA");  
		}  
	}  
}
