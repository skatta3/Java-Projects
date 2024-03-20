package com.java.strings;

public class StringBufferExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Welcome");
		
		System.out.println("sb : " + sb);
		
		sb.append(" to Java");
		
		System.out.println("sb : " + sb);
		
		sb.insert(1, "Hi");
		
		System.out.println("sb : " + sb);
	}
}
