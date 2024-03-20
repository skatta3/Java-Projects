package com.java.training.string;


//Java code to illustrate StringBuilder 

import java.util.*; 
import java.util.concurrent.LinkedBlockingQueue; 

public class JavaStringBuilder { 
	public static void main(String[] argv) 
		throws Exception 
	{ 

		// create a StringBuilder object 
		// usind StringBuilder() constructor 
		StringBuffer str = new StringBuffer(); 

		str.append("GFG"); 
		

		// print string 
		System.out.println("String = "	+ str.toString()); 

		// create a StringBuilder object 
		// usind StringBuilder(CharSequence) constructor 
		StringBuffer str1 	= new StringBuffer("AAAABBBCCCC"); 

		str1.insert(6, " Hello ");
		
		System.out.println(str1);
		
//		// print string 
//		System.out.println("String1 = "
//						+ str1.toString()); 
//
//		// create a StringBuilder object 
//		// usind StringBuilder(capacity) constructor 
//		StringBuilder str2 
//			= new StringBuilder(10); 
//
//		// print string 
//		System.out.println("String2 capacity = "
//						+ str2.capacity()); 
//
//		// create a StringBuilder object 
//		// usind StringBuilder(String) constructor 
//		StringBuilder str3 
//			= new StringBuilder(str1); 
//
//		// print string 
//		System.out.println("String3 = "
//						+ str3.toString()); 
	} 
} 

