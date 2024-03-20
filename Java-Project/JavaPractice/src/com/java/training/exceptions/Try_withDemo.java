package com.java.training.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Try_withDemo {

   public static void main(String args[]) {
	   FileReader fr = null;
   
	   try {
	   fr = new FileReader("C://users//skatt//input1.txt");
         char [] a = new char[50];
         fr.read(a);   // reads the contentto the array
         for(char c : a)
         System.out.print(c);   // prints the characters one by one
         fr.close(); 
	 } 
	   
	   catch(FileNotFoundException fe) {
	    	 System.out.println("In Catch Block FileNotFoundException");
	 //   	 fe.printStackTrace();
	    	 System.out.println("\n--------------------------------");
	    	 fe.getMessage();
	    	 System.out.println("\n---------------------------------");
	    	 fe.getLocalizedMessage();  
      } catch(Exception e) {
    	 System.out.println("In Catch Block");
    	 e.printStackTrace();
      } finally {
     	 try {
     		 System.out.println("In Finally Block");
     		 fr.close();
     	 } catch(Exception e) {
     		 
     	 }
     }

   }
}