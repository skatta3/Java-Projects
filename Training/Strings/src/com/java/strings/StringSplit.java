package com.java.strings;

public class StringSplit {
	public static void main(String args[]){  
		String s1="java string split method by Java Training";  
		String[] words=s1.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
//		for(String w:words){  
//			System.out.println(w);  
//		}  
		
		System.out.println(s1.lastIndexOf("a"));
	}
}