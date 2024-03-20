package com.java.concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapReduce {
		public static void main(String[] args) {
			ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
			map.put("Java", "Programming");
			map.put("MySQL", "Database");
			map.put("HTML", "Frontend");
			map.put("JavaScript", "Scripting");
			
			
			String reduce = map.reduce(2, (k, v) -> k +"-"+v, (r1, r2) -> r1 +"," + r2); 

			System.out.println(reduce); 
			
			String reduceKeys = map.reduceKeys(2, (k1,k2)->k1+","+k2);
			
			System.out.println(reduceKeys);
			
			String reduceValues = map.reduceValues(2, (v1,v2)->v1+","+v2);
			
			System.out.println(reduceValues);


		}

}
