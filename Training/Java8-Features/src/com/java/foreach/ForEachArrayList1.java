package com.java.foreach;

	// Java program to demonstrate
	// forEach() method of Iterable interface

import java.util.*;
import java.util.function.Consumer;

class CityConsumer implements Consumer<String> {

	@Override
	public void accept(String t)
	{
		System.out.println(t);
	}
}

// Now we can use the CityConsumer
// with forEach method by just creating
// an object of CityConsumer class as below.

public class ForEachArrayList1 {

	public static void main(String[] args)
	{
		List<String> data = new ArrayList<>();
		data.add("New Delhi");
		data.add("New York");
		data.add("Mumbai");
		data.add("London");

		// create an object of CityConsumer
		// and pass it to forEach method
		CityConsumer cityConsumer = new CityConsumer();
		data.forEach(cityConsumer);
	}
}
