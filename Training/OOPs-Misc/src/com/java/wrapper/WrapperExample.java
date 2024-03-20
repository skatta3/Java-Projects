package com.java.wrapper;

//Java program to convert primitive into objects  
//Autoboxing example of int to Integer  
public class WrapperExample{  
	public static void main(String args[]){  
	//Converting int into Integer  
	int a = 20;  
	Integer i=Integer.valueOf(a);//converting int into Integer explicitly  Before Java 5
	
	Integer j = a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
	
	System.out.println(a+" "+i+" "+j);  
	}
}  