package com.java.training.wrapper;

public class Unboxing {
    public static void main(String[] args)
    {
        Byte B = new Byte((byte) 10);   //Byte Object
        byte b = B;                    //Auto-Unboxing of Byte Object
 
        Short S = new Short((short) 20);   //Short Object
        short s = S;                      //Auto-Unboxing of Short Object
 
        Integer I = new Integer(15);    //Integer Object
        int i = I;                     //Auto-Unboxing of Integer Object
 
        Long L = new Long(50);     //Long Object
        long l = L;               //Auto-Unboxing of Long Object
 
        Float F = new Float(20);      //Float Object
        float f = F;                 //Auto-Unboxing of Float Object
 
        Double D = new Double(20.5);   //Double Object
        double d = D;                 //Auto-Unboxing of Double Object
 
        Boolean BLN = new Boolean(true);      //Boolean Object
        boolean bln = BLN;                   //Auto-Unboxing of Boolean Object
 
        Character C = new Character('C');    //Character Object
        char c = C;                         //Auto-Unboxing of Character Object
    }
}
