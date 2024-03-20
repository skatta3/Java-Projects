package com.java.concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ReduceExample1 {
	public static void main(String[] args) {
		ConcurrentHashMap<String, String> reducedMap = new ConcurrentHashMap<>();
		reducedMap.put("Krishna", "India");
		reducedMap.put("Ahmed", "Pakistan");
		reducedMap.put("Frank", "USA");
		reducedMap.put("Martin", "Germany");
		
		String reduce = reducedMap.reduce(2, (k, v) -> k+"-"+v, (r1, r2) -> r1 +","+r2);
		System.out.println("reduce example => " +reduce); 
	}
}
