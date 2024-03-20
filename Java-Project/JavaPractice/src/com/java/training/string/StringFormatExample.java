package com.java.training.string;

public class StringFormatExample {

    public static void main(String args[])
    {
        // Custom input string to be formatted
        String str1 = "Welcome";
    	String str2 = "Java Training";
    	
    	// Concatenation of two strings
    	String str = String.format(
                "My Company name"
                    + " is: %1$s, %1$s and %2$s",
                str1, str2);
    	// Concatenation of two strings
        String s = String.format(str);
  
        // Output is given upto 8 decimal places
        String str3 = String.format("My answer is %.8f", 47.65734);
  
        // Here answer is supposed to be %15.8f" and
        // "47.65734000" there are 15 spaces
        String str4 = String.format("My answer is %15.8f",
                                    47.65734);
  
        // Print and display strings
        System.out.println(s);
        System.out.println(str3);
        System.out.println(str4);
    }
}
