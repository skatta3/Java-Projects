package com.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderExample {
	public static void main(String[] args) throws FileNotFoundException {
		  BufferedReader br = new BufferedReader(new FileReader(new File("C:\\tmp\\File1.txt")));
		  long lineNo=br.lines().count();


		  System.out.println(lineNo); 


	}
}
