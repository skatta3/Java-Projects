package com.java.training.exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	   public static void main(String args[]) {
	     // FileReader fr = null;		
//	      try {
//		      File file = new File("D:\\file.txt");
//		      fr = new FileReader(file);    
	        try(FileReader fr = new FileReader("D:\\file.txt")) {
	       	 char [] a = new char[50];
	       	fr.read(a);   // reads the content to the array
	         for(char c : a)
	         System.out.print(c);   // prints the characters one by one
	      } catch (IOException e) {
	         e.printStackTrace();
//	      }finally {
//	         try {
//	            fr.close();
//	         } catch (IOException ex) {		
//	            ex.printStackTrace();
//	         }
	      }
	   }
	}
