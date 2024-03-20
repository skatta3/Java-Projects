package com.training.JIT;

public class Calculation {
   int z;
	
   public static void main(String[] args) {
	   Calculation calc = new Calculation();
	   System.out.println("Sum of two numbers:  " + calc.Sum(2, 3));
	   System.out.println("Sum of two numbers:  " + calc.Sum(2, 3,4));
	   
	   boolean check = true;
	   
	   if(check) {
		   
		   System.out.println("The Value is True");
	   } else if (!check) {
		   System.out.println("The Value is false");
   
	   } else {
		   System.out.println("The Value is not known");

	   }
	   
   }
   public void addition(int x, int y) {
      z = x + y;
      System.out.println("The sum of the given numbers:"+z);
   }
	
   public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("The difference between the given numbers:"+z);
   }
   
   public int Sum(int a, int b) {
	   return a+b;
   }
   public int Sum(int a, int b, int c) {
	   return a+b+c;
   }
   
   
	   }
