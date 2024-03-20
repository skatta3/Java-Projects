package com.java.training.string;

public class StringExample {
    public static void main(String[] args)
    {
        //Creating string objects using literals
 
        String s1 = "abc";
 
        String s2 = "abc";
 
        System.out.println(s1 == s2);        //Output : true
 
        //Creating string objects using new operator
 
        String s3 = new String("abc");
 
        String s4 = new String("abc");
 
        System.out.println("S3 == s4: " + s3 == s4);        //Output : false
        System.out.println("s3.equals(s4): " + s3.equals(s4)); 
        
        s1 = "Hello World";
        System.out.println(s1.substring(6));
    }
}
