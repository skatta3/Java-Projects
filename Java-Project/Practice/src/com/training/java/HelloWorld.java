package com.training.java;

import java.util.Date;

import com.training.practice.Calculate;

public class HelloWorld {
		public static void main(String[] args ) {
			System.out.println("Hello Jaber, Welcome to Java Training");
			Calculate calc = new Calculate();
			
			int result = calc.addition(4, 8);
			System.out.println("The Sum of two numbers is : " + result);
			
			System.out.println("Today's Date is : "  + new Date());
			
		}

}

class Add {
	
}

class Subtract {
	
}
