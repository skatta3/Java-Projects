package com.java.varargs;

public class VarargsExample2 {   
	 static void display(String... values){  
		 System.out.println("display method invoked ");  
	 }  
	  
	 public static void main(String args[]){  
		 display();//zero argument   
		 display("my","name","is","varargs");//four arguments  
	 }   
	}  
	      