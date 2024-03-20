package com.java.bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterExample {
	public static void main(String[] args) throws Exception {     
	    FileWriter writer = new FileWriter("bufwritout.txt");  
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("Welcome to BufferedWRiter.");  
	    buffer.close();  
	    System.out.println("Success");  
	}  
}
