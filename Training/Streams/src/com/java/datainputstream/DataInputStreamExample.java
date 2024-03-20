package com.java.datainputstream;

import java.io.*;    
public class DataInputStreamExample {  
  public static void main(String[] args) throws IOException {  
    InputStream input = new FileInputStream("C:\\Users\\skatt\\17Aug23\\file1.txt");  
    DataInputStream inst = new DataInputStream(input);  
    int count = input.available();  
    
    System.out.println("Count : " + count);
    byte[] ary = new byte[count];  
    inst.read(ary);  
    for (byte bt : ary) {  
      char k = (char) bt;  
      System.out.print(k);  
    }  
  }  
}  