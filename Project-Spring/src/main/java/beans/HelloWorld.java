package com.spring.beans;

public class HelloWorld {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
   public void printMessage() {
	   System.out.println("Welcome to Spring Java Based COnfiguration");
   }
}