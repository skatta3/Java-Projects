package com.java.methodoverriding;

import java.io.*;  

// If the superclass method does not declare an exception

class Parent{  
  void msg(){
	  System.out.println("parent");
  }  
}  
  
public class TestCase1 extends Parent{  
  void msg() throws IOException{  
    System.out.println("TestExceptionChild");  
  }  
  
  public static void main(String args[]){  
	   Parent p=new TestCase1();  
	   p.msg();  
  }  
}  