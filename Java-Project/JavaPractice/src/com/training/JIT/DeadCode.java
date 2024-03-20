package com.training.JIT;

public class DeadCode {
	   public static void main(String args[]) 
	    { 
	  
	        System.out.println("Testing the Dead Code Logic"); 
	  
	        return; 
	  
	        // it will never run and gives error 
	        // as unreachable code. 
	        System.out.println("This code is not reachable"); 
	    } 
	   
/**
 * Any Statement after break
 *    public static void main(String args[]) 
    { 
  
        System.out.println("I will get printed"); 
  
        return; 
  
        // it will never run and gives error 
        // as unreachable code. 
        System.out.println("I want to get printed"); 
    } 
 * Any statement after throw exception
 * public static void main(String args[]) 
    { 
        int a = 2; 
        for (;;) { 
  
            if (a == 2) { 
  
                break; 
  
                // it will never execute, so 
                // same error will be there. 
                System.out.println("I want to get printed"); 
            } 
        } 
    } 
 */
}


