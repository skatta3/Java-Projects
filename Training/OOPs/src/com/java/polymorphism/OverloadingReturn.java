package com.java.polymorphism;

public class OverloadingReturn {
	public static void main(String[] args){  
		System.out.println(Addr.add(11,11));//ambiguity  
	}
}

class Addr{  
	static int add(int a,int b){
		return a+b;
	}  
	static double add(int a,int b){
		return a+b;
	}  
}  