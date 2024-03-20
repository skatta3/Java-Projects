package com.java.training.loops;

	// Java program to illustrate enhanced for loop 
public class EnhancedForLoop { 
	    public static void main(String args[]) 
	    { 
	        String array[] = {"Ron", "Harry", "Hermoine"}; 
	  
	        System.out.println("-----------ENHANCED FOR LOOP-----------");
	        //enhanced for loop 
	        for (String x:array) 
	        { 
	            System.out.println(x); 
	        } 
	  
	        System.out.println("-----------BASIC FOR LOOP-----------");
	        //for loop for same function 
	        for (int i = 0; i < array.length; i++) 
	        { 
	            System.out.println(array[i]); 
	        } 
	       
	    } 
	} 