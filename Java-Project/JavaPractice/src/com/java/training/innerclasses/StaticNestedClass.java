package com.java.training.innerclasses;

public class StaticNestedClass {
	   static class NestedClass {
	      public void my_method() {
	         System.out.println("This is my nested class");
	      }
	   }
	   
	   public static void main(String args[]) {
		   StaticNestedClass.NestedClass nested = new StaticNestedClass.NestedClass();	 
	      nested.my_method();
	   }
}
