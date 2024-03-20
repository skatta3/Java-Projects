package com.java.bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Java program to illustrate
//BufferedInputStream mark() method
public class BufferedInputMark {
	public static void main(String[] args) throws IOException
	{

		// Create input stream 'demo.txt'
		// for reading containing text "GEEKS"
		FileInputStream inputStream = new FileInputStream("C:\\Users\\skatt\\17Aug23\\file1.txt");

		// Convert inputStream to
		// bufferedInputStream
		BufferedInputStream buffInputStr = new BufferedInputStream(inputStream);

		// Read and print characters one by one
		System.out.println("Char : " + (char)buffInputStr.read());
		System.out.println("Char : " + (char)buffInputStr.read());
		System.out.println(	"Char : " + (char)buffInputStr.read());

		// Mark is set on the input stream
		buffInputStr.mark();
		System.out.println("------------");
		System.out.println("Char : "+ (char)buffInputStr.read());

		// Reset() is invoked
		buffInputStr.reset();

//		// Read and print characters
		System.out.println("Char : " + (char)buffInputStr.read());
		System.out.println("Char : " + (char)buffInputStr.read());
	}
}

