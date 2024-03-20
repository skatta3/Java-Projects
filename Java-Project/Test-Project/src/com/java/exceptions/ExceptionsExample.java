package com.java.exceptions;

public class ExceptionsExample {
	public static void main(String[] args) {
		int num1 =2;
		int num2 =3;
		int num3= 0;
		
		System.out.println("The Addition of 2 numbers: " + (num1 + num2));
		try {
			int[] arr = new int[2];
			arr[3] = num2/num3;
			System.out.println("The division of 2 numbers: " + (num2 / num3));
			String s = null;
			System.out.println(s.length());
		} catch(ArithmeticException ae) {
			System.err.println("ARITHMETIC EXCEPTION OCCURED");
		} catch(Exception e) {
			System.err.println("SOME OTHER EXCEPTION OCCURED");
			e.printStackTrace();
		}
		System.out.println("The Multiplication of 2 numbers: " + (num1 * num2));
		
		
	}
	

	
	

}
