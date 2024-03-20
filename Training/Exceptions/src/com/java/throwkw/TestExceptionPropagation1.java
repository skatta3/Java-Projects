package com.java.throwkw;

public class TestExceptionPropagation1 {
	  void method1(){  
	    int data=50/0;  
	  }  
	  
	  void method2(){  
		  method1();  
	  }  
	  
	  void method3(){  
		   try{  
			   method2();  
		   }catch(Exception e){
			   System.out.println("exception handled");
			}  
	  }  
	  
	  public static void main(String args[]){  
		   TestExceptionPropagation1 obj=new TestExceptionPropagation1();  
		   obj.method3();  
		   System.out.println("normal flow...");  
	  }  
	}  