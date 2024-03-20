package com.java.exceptions;

import java.io.PrintWriter;  
  
public class TryCatchExample10 {  
  
    public static void main(String[] args) {  
          
        PrintWriter pw;  
        try {
			pw = new PrintWriter("JPtest.txt"); // may throw exception
			pw.println("saved");
        } catch(Exception e) {
        	e.printStackTrace();
        }
    
    System.out.println("File saved successfully");  
    }  
}  

// To handle Checked Exception