package com.java.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
//		Vector vec = new Vector(); //Non-generic way of declaration
		
		Vector<String> vec = new Vector<String>(); //Generic way of declaration

		vec.add("Mango");
		vec.add("Guava");
		vec.add("Papaya");
		vec.add("Banana");
		vec.add("Mango");
		
//		vec.add(12);
		Employee emp = new Employee();
//		vec.add(emp);
		
	      Enumeration en = vec.elements();
	      System.out.println("\nElements are:");
	      while(en.hasMoreElements())
	         System.out.println(en.nextElement() + " ");
	}
}
