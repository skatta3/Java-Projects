package com.java.training.exceptions;

import java.io.FileReader;

public class ExceptionExample {
	
	public static void main(String[] args) {
		   FileReader fr = null;
		   char [] a = new char[50];
		   try {
		   fr = new FileReader("C://users//skatt//input.txt");
	         
	         fr.read(a);   // reads the contentto the array
	         for(char c : a)
	        	 System.out.print(c);   // prints the characters one by one
	         
//	         for(int i=0; i<=51;i++)
//	        	 System.out.print(a[i]);   // prints the characters one by one
	         
	         fr.close();
		   } 
		   
		   catch(ArrayIndexOutOfBoundsException ae) {
			   System.out.println("ArrayIndexOutOfBoundsException");
			   ae.printStackTrace();
//			   System.out.println("ÄE  "+ ae.getMessage());
		   } 
		   
		   catch(Exception e) {
			   System.out.println("Exception ---------------");
			   e.printStackTrace();
		   }  
		   
		   finally {
			   System.out.println("Executing the finally block");
			   try {
				   fr.close();
			   } catch(Exception e1) {
				   
			   }
		   }
		   
	}

}
