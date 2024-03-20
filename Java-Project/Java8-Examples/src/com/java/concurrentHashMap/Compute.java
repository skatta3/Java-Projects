package com.java.concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class Compute {
	// Main method
	public static void main(String[] args)
	{

		// create a ConcurrentHashMap and add some values
		ConcurrentHashMap<String, Integer>
			map = new ConcurrentHashMap<>();
		map.put("Book1", 10);
		map.put("Book2", 500);
		map.put("Book3", 400);

		// print map details
		System.out.println("ConcurrentHashMap: "
						+ map.toString());

		// remap the values of ConcurrentHashMap
		// using compute method
		map.compute("Book2", (key, val)
								-> val + 100);
		map.compute("Book1", (key, val)
								-> val + 512);

		// print new mapping
		System.out.println("New ConcurrentHashMap: "
						+ map);
	}
}
