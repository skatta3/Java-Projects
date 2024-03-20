package com.java.forloop;

public class Calculationforeach {
	public static void main(String[] args) {  
		String[] names = {"Java","C","C++","Python","JavaScript"};  
		System.out.println("Printing the content of the array names:\n");  
	
		// for each loop or advanced for loop
		for(String name:names) {  
			System.out.println(name);  
		}  
//		
//		System.out.println("--------Basic for Loop -----");
//		for(int i=0; i<names.length; i++) {
//			System.out.println(names[i]);
//		}
		
//		for(int i=333; i<=444; i=i+2) {
//			System.out.println(i);
//		}
	}  
}
