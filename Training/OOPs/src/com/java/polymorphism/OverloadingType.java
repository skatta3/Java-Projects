package com.java.polymorphism;

public class OverloadingType { 
	public static void main(String[] args){  
		System.out.println(Add.add(11,11));  
		System.out.println(Add.add(12.3,12.6));  
	}
}

class Add{  
	static int add(int a, int b){
		return a+b;
	}  
	static double add(double a, double b){
		return a+b;
	}  
}  

