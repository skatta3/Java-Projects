package com.java.training.finalclass;

public class FinalClass {
	    public static void main(String[] args)  
	    { 
	        // a final reference variable sb 
	        final StringBuilder sb = new StringBuilder("Geeks"); 
	          
	        System.out.println(sb); 
	          
	        // changing internal state of object 
	        // reference by final reference variable sb 
	        sb.append("ForGeeks"); 
	          
	        System.out.println(sb); 
	    }  
	    
	    
	} 