package com.java.collections;

import java.util.*;
public class TreeSetExample {
		// Main Method
		public static void main(String args[])
		{
			// Creating TreeSet and
			// adding elements
			TreeSet<String> ts = new TreeSet<String>();

			ts.add("Srinivas");
			ts.add("Kapil");
			ts.add("Sachin");
			ts.add("Virat");
			ts.add("Wasim");

			// Traversing elements
			Iterator<String> itr = ts.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}
