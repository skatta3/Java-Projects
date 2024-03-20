package com.java.priorityqueue;

import java.util.*;  
public class PriorityQueue1{  
	public static void main(String args[]){  
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		queue.add("Umbrella");
		queue.add("Amit");  

		
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		
		Iterator<String> itr=queue.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		} 
		
		queue.remove();  // Removes the top of the queue first element
		queue.poll();  // Removes the first element
		
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}  
	}  
}  