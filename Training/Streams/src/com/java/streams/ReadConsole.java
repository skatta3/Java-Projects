Srinivaspackage com.java.streams;

import java.io.*;
public class ReadConsole {

   public static void main(String args[]) throws IOException {
      InputStreamReader cin = null;

      try {
         cin = new InputStreamReader(System.in);
         System.out.println("Enter Your Name OR 'q' to quit.");
         StringBuilder str = new StringBuilder();
         char c;
         do {
            c = (char) cin.read();
            str = str.append(c);
         } while(c != 'q');
         System.out.println("Your Name is: " + str);
         System.err.println("Your Name is: " + str);
       }finally {
         if (cin != null) {
            cin.close();
         }
      }
      
//      try {
//    	  InputStream input = new FileInputStream("c:\\data\\...");
//    	  System.out.println("File opened...");
//
//    	} catch (IOException e){
//    	  System.err.println("File opening failed:");
//    	  e.printStackTrace();
//    	}
   }
}