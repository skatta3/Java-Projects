package com.java.strings;

public class StringRegex {
	public static void main(String args[]){  
		String s1="welcome to split world";  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",0)){  
			System.out.println("1111: " + w);  
		}  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",1)){  
			System.out.println("222222: "+ w);  
		}  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",2)){  
			System.out.println("3333333: "+w);  
		}  
	}  
}
