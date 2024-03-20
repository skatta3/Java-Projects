package com.java.polymorphism;

public class OverloadingTypePromotion { 
	  void sum(int a,long b){
		  System.out.println(a+b);
	  }  
	  
	  void sum(int a,int b,int c){
		  System.out.println(a+b+c);
	   }  
	  
	  public static void main(String args[]){  
		  OverloadingTypePromotion obj=new OverloadingTypePromotion();  
		  int a = 10;
		  int b=20;
		  
		  boolean c = true;
		  obj.sum(a,b);//now second int literal will be promoted to long  
		  obj.sum(20,20,20);   

	  }  
	
}