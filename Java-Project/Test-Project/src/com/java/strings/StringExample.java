package com.java.strings;

public class StringExample {
	
	public static void main(String[] args) {
		String str = "Welcome";
		
		str = "Welcome to Java";
		
		str = "Welcome to Java training";
		
		System.out.println("str : " + str);
		
		String str1 = "Welcome";
		
		String str3 = "Welcome";
		String str4 = "Welcome";
		str4 = "Welcome Srinivas";
		
		String str2 = new String("Welcome");
		
		System.out.println("str3 equals str4 : " + str3.equals(str2));
		System.out.println("str3 == str2 : " + (str3 == str2));
		
		String fName = "Srinivas";
		String lName = "Katta";
		
		String fullName = fName.concat(lName);
		String fullName1 = fName + lName;
		
		System.out.println("Full Name: " + fullName);
		System.out.println("Full Name1: " + fullName1);
		
		String substr = fullName.substring(5);
		String substr1 = fullName.substring(5,10);
		
		System.out.println("substr: " + substr);
		System.out.println("substr1: " + substr1);

		String s1 = " Srinivas Katta ";
		System.out.println(s1.charAt(4));
		
		String s2 = "12";
		
		System.out.println("Join : " + String.join(" ", fName,lName));

				
	}

}
