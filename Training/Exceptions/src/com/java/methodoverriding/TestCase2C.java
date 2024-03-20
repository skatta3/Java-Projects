package com.java.methodoverriding;

import java.io.*;  
// in case subclass overridden method declares no exception
class Parent2C{  
  void msg() throws Exception{
	  System.out.println("parent");
  }  
}  
  
public class TestCase2C extends Parent2C{  
  void msg(){
	  System.out.println("child");
  }  
  
  public static void main(String args[]){  
   Parent2C p=new TestCase2C();  
   try{  
	   p.msg();  
   }catch(Exception e)
   {}  
  }  
}  