package com.java.strings;

public class StringIntern {
	public static void main(String[] args) {
		String s=new String("Sachin");  
		String s2=s.intern();  
		System.out.println(s2);//Sachin  
		
//		String s3 = "Sachin";
//		System.out.println(s2.equals(s3));
//		System.out.println(s2 == s3);
	}
}
