package com.java.collections;

import java.util.*;
public class LinkedHashSetExample {
		// Main Method
		public static void main(String args[])
		{
			// Creating LinkedHashSet and
			// adding elements
			LinkedHashSet<String> lhs = new LinkedHashSet<String>();

			lhs.add("Mango");
			lhs.add("Apple");
			lhs.add("Grapes");
			lhs.add("Srinivas");
			lhs.add("Mango");
			lhs.add("Apple");
			lhs.add("Very helpful");

			// Traversing elements
			Iterator<String> itr = lhs.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}
