package com.java.strings;

public class StringConcatPlus {
	 public static void main(String args[]){  
		   String s="Sachin"+" Tendulkar";  
		   System.out.println(s);//Sachin Tendulkar  
		 }  
}


//The Java compiler transforms above code to this:
//
//
//String s=(new StringBuilder()).append("Sachin").append(" Tendulkar).toString();  
