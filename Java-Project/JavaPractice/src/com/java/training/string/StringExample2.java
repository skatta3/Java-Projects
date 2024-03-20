package com.java.training.string;

public class StringExample2 {
	   public static void main(String[] args)
	    {
	        String s1 = "JAVA";
	 
	        String s2 = "JAVA";
	 
	        System.out.println(s1 == s2);         //Output : true
	 
	        s1 = s1 + "J2EE";
	 
	        System.out.println(s1 == s2);         //Output : false
	        
	        s1 = s1.concat(s2);   //Equivalent to s1 + s2
	        
	        System.out.println(s1);
	        
	        s1 = s1 + s2;
	        
	        System.out.println(s1);
	    }
}
