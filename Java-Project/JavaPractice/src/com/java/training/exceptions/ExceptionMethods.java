package com.java.training.exceptions;

public class ExceptionMethods {
	   public static void main(String[] args)  
	    { 
	        try
	        { 
	            int a = 20/0; 
	        } catch (Exception e) 
	        { 
	            // printStackTrace method 
	            // prints line numbers + call stack 
//	            e.printStackTrace(); 
	              
	            // Prints what exception has been thrown 
//	            System.out.println("PrintSTackTrace  :" +e); 
//	            
//	            // toString method 
//	            System.out.println("ToString is:" + e.toString()); 
	            
	            // getMessage method 
	            // Prints only the message of exception 
	            // and not the name of exception 
	            System.out.println("GetMessage : " +e.getMessage()); 
	        } 
	    } 
}
