package com.java.exceptions;

//we also kept the code in a try block that will not throw an exception.


public class TryCatchExample3 {  	  
    public static void main(String[] args) {  
        try  
        {  
        	int data=50/0; //may throw exception   
                         // if exception occurs, the remaining statement will not exceute  
        	System.out.println("rest of the code in try block");  
        }  
             // handling the exception   
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        } 
        System.out.println("rest of the code after catch block");
          
    }  
      
}  