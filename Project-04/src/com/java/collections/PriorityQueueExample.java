package com.java.collections;

import java.util.*;
public class PriorityQueueExample {
	// Main Method
	public static void main(String args[])
	{
		// Creating empty priority queue
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

		// Adding items to the pQueue using add()
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);
		pQueue.add(12);

	System.out.println(pQueue);
		// Printing the top element of PriorityQueue
		System.out.println("Peek: " + pQueue.peek());

		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println("Poll: " + pQueue.poll());
		System.out.println(pQueue);

		// Printing the top element again
		System.out.println("Peek: " + pQueue.peek());
	}
}
