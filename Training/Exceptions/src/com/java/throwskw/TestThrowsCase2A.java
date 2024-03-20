package com.java.throwskw;

import java.io.*;  
// Program if exception occurs
class M2{  
	 void method()throws IOException{  
		 throw new IOException("device error");  
	 }  
}  
public class TestThrowsCase2A{  
   public static void main(String args[])throws IOException{//declare exception  
     M2 m=new M2();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
}  