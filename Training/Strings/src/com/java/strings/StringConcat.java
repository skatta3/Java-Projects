package com.java.strings;

public class StringConcat {
	public static void main(String args[]){  
	   String s1="Sachin ";  
	   String s2="Tendulkar";  
	   
	   String s3=s1.concat(s2);  
	   System.out.println(s3);//Sachin Tendulkar  
	   
	   s3=s1 + s2;  
	   System.out.println(s3);//Sachin Tendulkar  
	   
	   String s4 = "10";
	   String s5 = "20";
	   
	   System.out.println(s4.concat(s5));
	   
	}  
}
