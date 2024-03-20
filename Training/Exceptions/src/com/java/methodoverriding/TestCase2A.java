package com.java.methodoverriding;

import java.io.*;  
// in case subclass overridden method declares same exception
class Parent2A{  
  void msg() throws Exception{
	  System.out.println("parent");
  }  
}  
  
class TestCase2A extends Parent2A{  
  void msg() throws Exception{
	  System.out.println("child");
  }  
  
  public static void main(String args[]){  
	  Parent2A p=new TestCase2A();  
	  try{  
		  p.msg();  
	  }catch(Exception e){}  
  }  
}  