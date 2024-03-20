package com.java.training.variables;

public class RefFinalVariable {
    public static void main(String[] args)  
    { 
        // a final reference variable sb 
        final StringBuilder sb = new StringBuilder("Java"); 
          
        System.out.println(sb); 
          
        // changing internal state of object 
        // reference by final reference variable sb 
        sb.append(" Training"); 
          
        System.out.println(sb); 
        
        
        // Two Processes are accessing this calss
        final StringBuffer sb1 = new StringBuffer("Java"); 
        
        System.out.println(sb1); 
          
        // changing internal state of object 
        // reference by final reference variable sb 
        sb1.append(" Training"); 
          
        System.out.println(sb1); 
    }     
}
