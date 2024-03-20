package com.java.finalkw;

class Bike{  
   void run(){
	  System.out.println("running");
  }  
}  
	     
public class FinalMethod extends Bike{  
   void run(){
	   System.out.println("running safely with 100kmph");
   }  
     
   public static void main(String args[]){  
	   FinalMethod fm= new FinalMethod();  
	   fm.run();  
   }  
}  