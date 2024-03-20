package com.java.enums;


// enum inside the class
class EnumInsideClass{  
	enum Season { WINTER, SPRING, SUMMER, FALL; }//semicolon(;) is optional here  

	public static void main(String[] args) {  
		Season s=Season.WINTER;//enum type is required to access WINTER  
		System.out.println(s);  
	}
}  