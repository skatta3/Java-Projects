package com.java.console;

import java.io.Console;  
class ConsoleExample1{    
	public static void main(String args[]){    
		Console c=System.console();    
		System.out.println("Enter password: ");    
		char[] ch=c.readPassword();    
		String pass=String.valueOf(ch);//converting char array into string    
		System.out.println("Password is: "+pass);    
	}    
} 

//package com.java.streams;
//
//import java.io.*;
//public class ReadConsole {
//
//   public static void main(String args[]) throws IOException {
//      InputStreamReader cin = null;
//
//      try {
//         cin = new InputStreamReader(System.in);
//         System.out.println("Enter Your Name OR 'q' to quit.");
//         StringBuilder str = new StringBuilder();
//         char c;
//         do {
//            c = (char) cin.read();
//            str = str.append(c);
//         } while(c != 'q');
//         System.out.print("Your Name is: " + str);
//       }finally {
//         if (cin != null) {
//            cin.close();
//         }
//      }
//      
////      try {
////    	  InputStream input = new FileInputStream("c:\\data\\...");
////    	  System.out.println("File opened...");
////
////    	} catch (IOException e){
////    	  System.err.println("File opening failed:");
////    	  e.printStackTrace();
////    	}
//   }
//}

system.in