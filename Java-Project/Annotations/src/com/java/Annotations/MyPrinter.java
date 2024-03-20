package com.java.Annotations;

public class MyPrinter {
	public static void main(String[] args) {
		Document doc = new Document();
		System.out.println(doc);
	}
}

class Document {
	
//	public String tostring() {
	@Override
	public String toString() {
		return "I am a document";
	}
}
