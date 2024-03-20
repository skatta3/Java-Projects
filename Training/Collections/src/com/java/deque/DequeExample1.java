package com.java.deque;

import java.util.*;  
public class DequeExample1 {  
	public static void main(String[] args) {  
	    Deque<String> deque=new ArrayDeque<String>();  
	    deque.offer("arvind");  // Adds the Objects into Dequeue
	    deque.offer("vimal");  
	    deque.add("mukul");  
	    deque.offerFirst("jai");  // Added this object at first position in Queue
	    
	    System.out.println("After offerFirst Traversal...");  
	    for(String s:deque){  
	        System.out.println(s);  
	    }  
	    
	    deque.poll();  // Removes the first element from the Dequeue
	    //deque.pollFirst();//it is same as poll()  
	    deque.pollLast();  // Removed the last element
	    System.out.println("After pollLast() Traversal...");  
	    for(String s:deque){  
	        System.out.println(s);  
	    }  
	}  
}  