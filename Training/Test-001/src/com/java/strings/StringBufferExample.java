package com.java.strings;

public class StringBufferExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Welcome");
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.append(" to");
		System.out.println(sb);
		sb.insert(5, "cTraining");
		System.out.println(sb);
		sb.delete(0, 1);
		
		
		System.out.println(sb);
		System.out.println(sb.capacity());
	}
//	public void synchronized bookATicket(int requested) {
//		if(available >= requested) {
//			issue tickets
//			available = available - requested;
//		} else {
//			No tickets available
//		}
//	}
//	
//	public void getFlightInfo() {
//		
//	}
}
