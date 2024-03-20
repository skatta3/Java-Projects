package com.java.training.loops;

// Java program to illustrate while loop 
public class WhileLoop {
	    public static void main(String args[]) 
	    { 
	        int x = 1; 
	  
	        // Exit when x becomes greater than 4 
//	        while (x <= 4) 
//	        { 
//	            System.out.println("Value of x:" + x); 
//	            if(x == 2)
//	            		break;
//	            // Increment the value of x for 
//	            // next iteration 
//	            x++; 
//	        } 
	        
//	        do 
//	        { 
//	            System.out.println("Value of x:" + x); 
//	  
//	            // Increment the value of x for 
//	            // next iteration 
//	            x++; 
//	        } while (x >= 4);
	        
	        
	        for(int i = 1; i<=5; i++) {
	        	System.out.println("Fetching Employees: " + i);
	        	
	        	System.out.println("if Employee DOJ is before AUg 2021");
	        	if ((i ==2) || (i == 4))
	        			continue;
	        	
	        	System.out.println("The Bonus of teh Employee is two times teh Salary");
	        }
	    } 
	} 