package com.java.operators;

public class AssignmentOperatorDemo {
		   public static void main(String args[]) {
		      int num1 = 10;
		      int num2 = 20;

		      System.out.println("= Output: "+num2);
		      num2 = num1;
		      System.out.println("= Output: "+num2);

		      num2 += num1;  //num2 = num2+num1;
		      System.out.println("+= Output: "+num2);
//		      num2 = num2+num1;
//		      System.out.println("+= Output: "+num2);
		      
		      num2 -= num1;  //num2 = num2-num1;
		      System.out.println("-= Output: "+num2);
//		      num2 = num2-num1;
//		      System.out.println("-= Output: "+num2);
			      
		      num2 *= num1; // num2 = num2 * num1
		      System.out.println("*= Output: "+num2);
//		      num2 = num2 * num1;
//		      System.out.println("*= Output: "+num2);
		    		  
		      num2 /= num1;
		      System.out.println("/= Output: "+num2);
//		      num2 = num2/num1;
//		      System.out.println("/= Output: "+num2);
			      
		      num2 %= num1;
		      System.out.println("%= Output: "+num2);
//		      num2 = num2%num1;
//		      System.out.println("%= Output: "+num2);
		      
		      System.out.println("10%4= Output: "+10%4);
		      
		      
		   }
}
