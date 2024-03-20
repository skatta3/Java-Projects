package com.java.collections;
import java.util.*;

public class StackExample {
	// Main Method
	public static void main(String args[])
	{
		Stack<String> stack = new Stack<String>();
		stack.push("Mango");
		stack.push("Apple");
		stack.push("Guava");
		stack.push("Pomogranite");

		// Iterator for the stack
		Iterator<String> itr = stack.iterator();

		// Printing the stack
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		stack.pop();

		// Iterator for the stack
		itr = stack.iterator();

		// Printing the stack
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}

