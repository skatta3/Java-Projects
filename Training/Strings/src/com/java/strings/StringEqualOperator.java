package com.java.strings;

public class StringEqualOperator {
	public static void main(String args[]){  
		   String s1="Sachin";  
		   String s2="Sachin";  
		   String s3=new String("Sachin");  
		   
		   String s4 = " Tendulkar";
		   
		   System.out.println(s1==s2);//true (because both refer to same instance)  
		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  
		
		   System.out.println(" Using Equals Method");
		   
		   System.out.println(s1.equals(s2));
		   System.out.println(s1.equals(s3));
		   
		   System.out.println(s1.concat(s4));
		   
		   System.out.println(s1 + s4);
		   
		   
		}  
}
