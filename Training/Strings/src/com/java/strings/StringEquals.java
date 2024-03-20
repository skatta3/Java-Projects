package com.java.strings;

public class StringEquals {
	public static void main(String args[]){  
		   String s1="Sachin";  
		   String s2="SACHIN";  
		   
		   String s3=new String("Sachin");  
		   String s4="Saurav";  
		   
		   String s5 = "Sachin";
		   
		   
		   System.out.println("Comparing s1 and s3 with == operator : " + (s1 == s3));
		   System.out.println("Comparing s1 and s5 with == operator : " + (s1 == s5));
		   System.out.println("Comparing s1 and s2 :" + s1.equalsIgnoreCase(s2));//true  
//		   System.out.println(s1.equals(s3));//true  
//		   System.out.println(s1.equals(s4));//false  
		 }  
}
