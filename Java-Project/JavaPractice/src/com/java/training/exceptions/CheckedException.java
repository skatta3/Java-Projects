package com.java.training.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

   public static void main(String args[]) throws IOException {		
      File file = new File("C://tmp//File1.txt");
      FileReader fr = null;
      
        try {
			fr = new FileReader(file);
			String s = null;
			System.out.println(s.length());		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fr.close();
			System.out.println("File Closing code goes here");
		}  

 
      
   }
}