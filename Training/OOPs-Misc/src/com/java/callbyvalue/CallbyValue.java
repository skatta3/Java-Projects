package com.java.callbyvalue;

public class CallbyValue {

	 int data = 50;  
	  
	 void change(int data){  
		 data=data+100;//changes will be in the local variable only  
		 System.out.println("The Value of data inside method: " + data);
	 }  
	     
	 public static void main(String args[]){  
		 CallbyValue op=new CallbyValue();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(500);  
	   System.out.println("after change "+op.data);  
	  
	 }  
	}  
