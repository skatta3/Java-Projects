package com.java.operators;

public class AutoOperatorDemo {
	   public static void main(String args[]){
	      int num1=100;
	      int num2=200;
//	      num1++; //Post Increment
//	      num2--;  // Post Decrement
//	      System.out.println("  Post increment/Decrement  ");
//	      System.out.println("num1++ is: "+num1);
//	      System.out.println("num2-- is: "+num2);
//
//	      
//	      ++num1;  // Pre Increment
//	      --num2;  // Pre decrement
//	      System.out.println("  Pre increment/Decrement  ");
//	      System.out.println("num1++ is: "+num1);
//	      System.out.println("num2-- is: "+num2);

		   int a = 5;
		   int i = 0;
		   i = ++a + ++a + a++;
////		   i=6 + 7 + 7; (a=8)
		   System.out.println("The Value of i: " + i);
		   System.out.println("The Value of a: " + a);
		   a = 5;
		   i=++a + ++a + ++a;
////		   i=6 + 7 + 8; (a=8)
		   
		   System.out.println("The Value of i: " + i);
		   System.out.println("The Value of a: " + a);
	   }
}
