package com.java.methodoverriding;

// in case subclass overridden method declares subclass exception
import java.io.*;  
class Parent2B{  
  void msg() throws Exception{
	  System.out.println("parent");
  }  
}  
  
public class TestCase2B extends Parent2B{  
  void msg() throws ArithmeticException{
	  System.out.println("child");
  }  
  
  public static void main(String args[]){  
	   Parent2B p=new TestCase2B();  
	   try{  
		   p.msg();  
	   }catch(Exception e)
	   {
		   
	   }  
  }  
}  