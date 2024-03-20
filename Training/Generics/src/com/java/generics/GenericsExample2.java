package com.java.generics;

import java.util.ArrayList;
import java.util.List;

// Before Generics, we need to type cast.

public class GenericsExample2 {
	public static void main(String[] args) {
		List list = new ArrayList();    
		list.add("hello"); 
		list.add(100);
		String s = (String) list.get(0);//typecasting 
		Integer s1 = (Integer) list.get(1);//typecasting 
		
		//After Generics, we don't need to typecast the object.  
		List<String> list1 = new ArrayList<String>();    
		list1.add("hello");    
		String s2 = list1.get(0);    
	}
}
