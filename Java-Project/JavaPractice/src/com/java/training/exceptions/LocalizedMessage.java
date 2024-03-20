package com.java.training.exceptions;

public class LocalizedMessage {
    // Main Method 
    public static void main(String[] args) 
        throws Exception 
    { 
  
        try { 
            // add the numbers 
            addPositiveNumbers(2, -1); 
        } 
        catch (Exception e) { 
            System.out.println("LocalizedMessage = "
                               + e.getLocalizedMessage()); 
        } 
    } 
  
    // method which adds two positive number 
    public static void addPositiveNumbers(int a, int b) 
        throws Exception 
    { 
  
        if (a < 0 || b < 0) { 
  
            throw new Exception("Numbers are not Positive"); 
        } 
        else { 
  
            System.out.println(a + b); 
        } 
    } 
}
