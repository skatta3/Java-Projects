package com.java.exceptions;

import java.util.Date;

public class ExceptionsExample {
	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 0;
		String[] strArr = new String[3];
		
		try {
			strArr[2] = "Welcome";
//			System.out.println(num1/num2);			
		} catch(ArithmeticException ae) {
			System.out.println("We got ArithmeticException");
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Program Execution time: " + new Date());
		}
		
		String str = "Welcome to Exception Handling";
		
		System.out.println("The Value of the String is : " + str.length());
	}
	
}
