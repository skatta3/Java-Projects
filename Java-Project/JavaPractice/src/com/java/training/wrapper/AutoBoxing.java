package com.java.training.wrapper;

public class AutoBoxing {
    public static void main(String[] args)
    {
        byte b = 10;    //Primitive byte data
        Byte B = b;    //Auto-Boxing of byte data
 
        short s = 15;     //Primitive short data
        Short S = s;     //Auto-Boxing of short data
 
        int i = 20;       //Primitive int Data
        Integer I = i;    //Auto-Boxing of int data
 
        long l = 25;    //Primitive long data
        Long L = l;     //Auto-Boxing of long data
 
        float f = 12;     //Primitive float data
        Float F = f;     //Auto-Boxing of float data
 
        double d = 18.58;     //Primitive double data
        Double D = d;        //Auto-Boxing of double data
 
        boolean bln = true;    //Primitive boolean data
        Boolean BLN = bln;     //Auto-Boxing of boolean data
 
        char c = 'C';          //Primitive char data
        Character C = c;     //Auto-Boxing of char data
        
        System.out.println("Byte: " + B);
        
        System.out.println("Short: " + S);
        
        System.out.println("Integer: " + I);
        
        System.out.println("Long: " + L);
        
        System.out.println("Float: " + F);
        
        System.out.println("Double: " + D);
        
        System.out.println("Boolean: " + BLN);
        
        System.out.println("Character: " + C);
        
        Byte BB = new Byte ((byte) 10);
        
        Byte B3 = 12;
        
        byte bb = BB;
        
        byte b3 = B3;
        
        System.out.println("bb"  + bb + " " + "b3: " + b3);
        
        
        
       
    }
}
