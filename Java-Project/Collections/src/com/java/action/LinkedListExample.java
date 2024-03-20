package com.java.action;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {

	//	ArrayList arrList = new ArrayList(); //Non-Generic way of Declaration
		
		LinkedList<String> arrList = new LinkedList<String>(); //Generic way of declaration
		arrList.add("Mango");
		arrList.add("Papaya");
		arrList.add("Guava");
		arrList.add("Cherry");
		arrList.add("Banana");
		arrList.add("orange");
		arrList.add("Mango");
	//	arrList.add(12);
		
		Employee emp = new Employee();
	//	arrList.add(emp);
	
		Iterator itr = arrList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	//	System.out.println("BEFORE The Element of the Array List: " + arrList.get(3));
	//	arrList.set(3, "Apple");
	//	System.out.println("AFTER The Element of the Array List: " + arrList.get(3));
		arrList.add(3,"Apple");
		
		Iterator itr1 = arrList.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}	
	}
}
