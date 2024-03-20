package com.java.polymorphism;

public class OKTPIA { //Method Overloading with Type Promotion in case of ambiguity
	  
	  void sum(int a,long b){
		  System.out.println("a method invoked");
	  }  
	  
	  void sum(long a,int b){
		  System.out.println("b method invoked");
	  }  
	  
	  public static void main(String args[]){  
		  OKTPIA obj=new OKTPIA();  
		  obj.sum(20,20);//now ambiguity  
	  }  
	
}

