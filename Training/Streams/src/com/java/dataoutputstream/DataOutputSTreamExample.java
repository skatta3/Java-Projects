package com.java.dataoutputstream;

import java.io.*;  
public class DataOutputSTreamExample {  
    public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("C:\\Users\\skatt\\files1\\dataout1.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  
}  