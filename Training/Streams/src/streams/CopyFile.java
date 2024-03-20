package com.java.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;
      
//	   FileReader in = null;
//	   FileWriter out = null;
      
      String fileSeparator = System.getProperty("file.separator");
      
      //absolute file name with path
      String SourceFile = "C:" + fileSeparator+"Users"+fileSeparator+"skatt"+fileSeparator+"input.txt";
      String DestinationFile = "C:" + fileSeparator+"Users"+fileSeparator+"skatt"+fileSeparator+"output1.txt";
      try {
         in = new FileInputStream(SourceFile);
         out = new FileOutputStream(DestinationFile);
        
//         in = new FileReader(SourceFile);
//         out = new FileWriter(DestinationFile);     
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}