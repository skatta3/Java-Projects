package com.java.polymorphism;

public class OLTPMF {  //Method Overloading with Type Promotion if match found
	  void sum(int a,int b){
		  System.out.println("int arg method invoked");
	  }  
	  
	  void sum(long a,long b){
		  System.out.println("long arg method invoked");
	  }  
	  
	  public static void main(String args[]){  
		  OLTPMF obj=new OLTPMF();  
		  obj.sum(20,20);//now int arg sum() method gets invoked  
	  }  
	
}