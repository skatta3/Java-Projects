package com.java.concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class Merge {
	public static void main(String[] args) {
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
		map.put("X", "x");
		System.out.println("1st ==> " +map);
		System.out.println("2nd ==> " + map.merge("X", "x", (v1, v2) -> null));
		System.out.println("3rd ==> " +map);
		map.put("Y", "y");
		map.put("X", "x1");
		System.out.println("4th ==> " +map.merge("X", "x1", (v1, v2) -> "z"));
		System.out.println("5th ==> " +map);
		System.out.println("6th ==> " +map.merge(
		 "X", "x1", (v1, v2) -> v2.concat("z")));
		System.out.println("7th ==> " +map);

	}
}
