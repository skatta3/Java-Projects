package com.java.concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample2 {
	public static void main(String[] args) {
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
		map.put("Java", "Programming");
		System.out.println("1st ==> " +map);
		
		System.out.println("2nd ==> " + map.merge("Java", "Programming", (v1, v2) -> null));
		System.out.println("3rd ==> " +map);
		
		map.put("MySQL", "Database");
		map.put("HTML", "Scripting");
		System.out.println("4th ==> " +map.merge("MySQL", "Database", (v1, v2) -> "z"));
		System.out.println("5th ==> " +map);
		
		System.out.println("6th ==> " +map.merge("Database", "x1", (v1, v2) -> v2.concat("z")));
		System.out.println("7th ==> " +map);
	}
}
