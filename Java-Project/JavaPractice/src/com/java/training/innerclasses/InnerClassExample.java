package com.java.training.innerclasses;

public class InnerClassExample {
	  public static void main(String args[]) {
	      // Instantiating the outer class 
		  OuterClass outer = new OuterClass();
	      
	      // Accessing the display_Inner() method.
	      outer.display_Inner();
	   }
}

class OuterClass {
   int num;
   
   // inner class
   private class InnerClass {
      public void print() {
         System.out.println("This is an inner class");
         System.out.println("The Value of num is : "  + num);
      }
   }
   
   // Accessing he inner class from the method within
   void display_Inner() {
	   InnerClass inner = new InnerClass();
      inner.print();
   }
}
