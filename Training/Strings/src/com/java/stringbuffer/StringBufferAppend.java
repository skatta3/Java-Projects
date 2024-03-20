package com.java.stringbuffer;

public class StringBufferAppend {
	public static void main(String args[]){  
		StringBuffer sb=new StringBuffer("Hello ");  
		System.out.println(sb.capacity());
		sb.append("Java");//now original string is changed  
		
		System.out.println(sb);//prints Hello Java  
		
		sb.insert(0, "Welcome ");
		
		System.out.println(sb);//prints Hello Java  
		
		System.out.println(sb.capacity());

	}  
}
