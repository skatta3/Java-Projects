package com.java.methodoverriding;

import java.io.*;  

// subclass overridden method declares parent exception
class Parent2{  
  void msg() throws ArithmeticException{
	  System.out.println("parent");
  }  
}  
  
public class TestCase2 extends Parent2{  
  void msg() throws Exception{
	  System.out.println("child");
  }  
  
  public static void main(String args[]){  
	   Parent2 p=new TestCase2();  
	   try{  
		   p.msg();  
	   }catch(Exception e)
	   {}  
  }  
}  