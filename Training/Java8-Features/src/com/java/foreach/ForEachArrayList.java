package com.java.foreach;

// Java program to demonstrate
//forEach() method of Iterable interface

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachArrayList {

	public static void main(String[] args)
	{
		List<String> data = new ArrayList<>();
		data.add("New Delhi");
		data.add("New York");
		data.add("Mumbai");
		data.add("London");

		data.forEach(new Consumer<String>() {

			@Override
			public void accept(String t)
			{

				System.out.println(t);
			}

		});
	}
}
