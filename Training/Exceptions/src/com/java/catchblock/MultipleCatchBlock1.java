package com.java.catchblock;

public class MultipleCatchBlock1 {  
	  
    public static void main(String[] args) {  
          
           try{    
        	   String str = null;
        	   System.out.println(str.length());
                int a[]=new int[5]; 
                a[6] = 12;
                a[5]=30/0;    
                
                System.out.println("Practicing Exception Handling Framework in Java");
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
           }   finally {
                  System.out.println("FINALLY BLOCK -- Practicing Exception Handling Framework in Java");
           }
           
           System.out.println("rest of the code");    
    }  
}  