package com.java.stringbuffer;

public class StringBuffersubstring {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Welcome to online Java Training");
		
		System.out.println(sb);
		
		System.out.println("The length is : " + sb.length());
		
		System.out.println("The substring with STartIndex is :" + sb.substring(11));
		
		System.out.println("The substring with STart and End Index is : "  + sb.substring(11, 17));
		
		System.out.println("The charAt : " + sb.charAt(5));
		
	}
}
