package com.java.stringbuffer;

public class StringBufferCapacity {
	public static void main(String args[]){  
		StringBuilder sb=new StringBuilder();  
		System.out.println(sb.capacity());//default 16  
		StringBuilder sb1=new StringBuilder();  
		sb.append("Hello");  
		sb1.append("Hello");  
		
		System.out.println(sb.equals(sb1));
		System.out.println((sb == sb1));
		System.out.println(sb.capacity());//now 16  
		
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		
		System.out.println(sb);
		
		sb.append(" Checking ");
		
		System.out.println(sb.capacity());
	}  
}
