package com.java.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();
		vec.add("Mango");
		vec.add("Papaya");
		vec.add("Mango");
		
		System.out.println(vec.get(1));
//		
////		vec.add(12);
////		vec.add(14);
//		
//		Customer cust = new Customer();
//		
////		vec.add(cust);
//		
//		Enumeration enu = vec.elements();
//		while(enu.hasMoreElements()) {
//			System.out.println(enu.nextElement());
//		}
//		
//		System.out.println("-----------------------------");
//		for(String str : vec) {
//			System.out.println(str);
//		}
		
	}
}
