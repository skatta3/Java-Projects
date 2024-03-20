package com.java.bufferedreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Read from Console
public class BufferedReaderExample1 {
	public static void main(String args[])throws Exception{             
	    InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);            
	    System.out.println("Enter your name");    
	    String name=br.readLine();    
	    System.out.println("Welcome "+name);    
	}    
}
