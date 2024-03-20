package com.java.stack;

import java.util.Stack;  
// Peek Method
public class Stack3   
{  
	public static void main(String[] args)   
	{  
		Stack<String> stk= new Stack<>();  
		// pushing elements into Stack  
		stk.push("Apple");  
		stk.push("Grapes");  
		stk.push("Mango");  
		stk.push("Orange");  
		
		System.out.println("Stack: " + stk);  
		// Access element from the top of the stack  
		String fruits = stk.peek();  
		//prints stack  
		System.out.println("Element at top: " + fruits);  
	}  
}  