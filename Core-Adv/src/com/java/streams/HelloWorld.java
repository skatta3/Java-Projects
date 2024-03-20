package com.java.streams;

public class HelloWorld {

	public static void main(String[] args) {
		
	      String data = "I will write this String to File in Java";
	
	        String fileSeparator = System.getProperty("file.separator");
	      	String fileName = "C:" + fileSeparator+"users"+fileSeparator+"skatt"+fileSeparator+"Training"+fileSeparator+"Test.txt";
	      	
		WriteFile wf = new WriteFile();
		wf.writeUsingOutputStream( data,  fileName);
		
	}

}
