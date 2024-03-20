package com.java.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExConsole {
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		 System.out.print("Enter Your Validation- ");  
		 String a= sc.nextLine();  
		 
		 Scanner sc1= new Scanner(System.in);    //System.in is a standard input stream  
		 System.out.print("Enter Your Name- ");  
		 String a1= sc1.nextLine();  
		 
		 if(Pattern.matches(a, a1)) {
			 System.out.println("This is Valid Name");
		 } else {
			 System.out.println("You have entered Invalid Name");
		 }
		 
	
	}
}
