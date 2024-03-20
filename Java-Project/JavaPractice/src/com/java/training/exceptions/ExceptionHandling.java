package com.java.training.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args) throws FileNotFoundException, IOException {
//		try{
//			testException(-5);
//			testException(-10);
//		}catch(FileNotFoundException | IOException e){
//			e.printStackTrace();
//		}catch(IOException e){
//			e.printStackTrace();
//		}finally{
//			System.out.println("Releasing resources");			
//		}
//		try {
//			int a = 5; int b=0;
//			int c = a/b;
//		} catch (ArithmeticException e) {
//			System.out.println("You cannot divide the number by 0");
//			e.printStackTrace();
//		}
		try {
			//Opened a file
			//ened a DB Connection
			int a[] = new int[5];			
			int c = a[4];
			System.out.println(c);		
			c = a[7];
			
			//Close the file
			//Close the DB Connection
		
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You cannot Access Array element");
			System.out.println("Get Message" + e.getMessage());
			System.out.println("Get Message" + e.getLocalizedMessage());
	
		} catch (NumberFormatException e) {
			System.out.println("You cannot Access Array element");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("You cannot Access Array element");
			e.printStackTrace();
		}
		finally {
			//Close the file
			//Close the DB Connection
			
			System.out.println("Ëxecuting Finally Block of code");
		}
//		testException(15);
	}
	
//	public static void testException(int i) throws FileNotFoundException, IOException{
//		if(i < 0){
//			FileNotFoundException myException = new FileNotFoundException("Negative Integer "+i);
//			throw myException;
//		}else if(i > 10){
//			throw new IOException("Only supported for index 0 to 10");
//		}
//
//	}

}

