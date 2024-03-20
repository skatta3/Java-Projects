package com.java.generics;

import java.util.ArrayList;

public class ArrayListEx {
	
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		
//		al.add("Mango");
//		al.add("Hyderabad");
//		al.add(12);
		
		Employee emp = new Employee();
		
		al.add(emp);
	}

}
