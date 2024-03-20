package com.java.innerclasses;


//Local Inner Class
public class LocalInnerClass{  
	 private int data=30;//instance variable  

	 void display(){  // Method
		 //Local Inner Class
		 class Local{  
			 void msg(){
				 System.out.println(data);
			}  
		 }  
		 
	  Local l=new Local();  
	  l.msg();  
	 } 
	 
	 public static void main(String args[]){  
		 LocalInnerClass obj=new LocalInnerClass();  
		 obj.display();  
	 }  
}  