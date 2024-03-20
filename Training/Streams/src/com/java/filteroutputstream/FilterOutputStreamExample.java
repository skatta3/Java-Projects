package com.java.filteroutputstream;

import java.io.*;  
public class FilterOutputStreamExample {  
    public static void main(String[] args) throws IOException {  
        File data = new File("C:\\Users\\skatt\\files1\\dataout1.txt");  
        FileOutputStream file = new FileOutputStream(data); 
        
        FilterOutputStream filter = new FilterOutputStream(file);  
        String s="Welcome to Filter Output Stream.";      
        byte b[]=s.getBytes();      
        filter.write(b);     
        filter.flush();  
        filter.close();  
        file.close();  
        System.out.println("Success...");  
    }  
}  
   