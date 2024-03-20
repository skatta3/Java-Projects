package com.java.callbyvalue;

public class CallbyReference{  
	 int data=50;  
	  
	 void change(CallbyReference op){  
		 op.data=op.data+100;//changes will be in the instance variable  
	 }  
	     
	    
	 public static void main(String args[]){  
		 CallbyReference op=new CallbyReference();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(op);//passing object  
	   System.out.println("after change "+op.data);  
	  
	 }  
	}  