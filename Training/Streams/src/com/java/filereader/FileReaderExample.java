package com.java.filereader;

import java.io.FileReader;

public class FileReaderExample {
    public static void main(String args[])throws Exception{    
        FileReader fr=new FileReader("testout.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        	System.out.print((char)i);    
        fr.close();    
  }    
}
