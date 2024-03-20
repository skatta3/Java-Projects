package com.java.strings;

public class StringExample {
	public static void main(String[] args) {
		String str1 = "Welcome";  //One way of creating the String
		
//		str1 = "Welcome to Java";
//		
		str1 = "Welcome to Java Training";
		
		String[] strArr = str1.split(" ");
		
		System.out.println("Basic For Loop");
		//Basic for loop
		for(int i=10; i< 100; i=i+2) {
				System.out.println(i);
		}
		
//		System.out.println("Advanced For Loop");
//		//Advanced For Loop
//		for(String x:  strArr) {
//				System.out.println(x);
//			
//		}
//		System.out.println(str1.substring(0,4));
		
//		String str2 = "Welcome";
//		
//		
//		String str3 = new String("Welcome"); //Second way of creating String
//		
//		
//		// String Comparison
//		
//		System.out.println("String Comparison with equals str2 and str1 : "  + str2.equals(str1));
//		System.out.println("String Comparison with == str2 and str1 : "  + (str2 == str1));
//		
//		
//		
//		System.out.println("The Value of the String str1 is : " + str1);
		
//		String str5 = "12";
//		
//		String str6 = "Srinivas";
//		String str7 = "Katta";
//		
//		System.out.println(str6.concat(str7));
//		
//		String str8 = String.join(" ",str6, str7);
//		System.out.println(str8);
	}
}
