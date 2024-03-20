package com.java.stringbuilder;

public class StringBuilderCapacity {
	public static void main(String args[]){  
		StringBuilder sb=new StringBuilder();  
		System.out.println(sb.capacity());//default 16 
		
		sb.append("Hello");  
		System.out.println(sb.capacity());//now 16  
		
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
	}  
}
