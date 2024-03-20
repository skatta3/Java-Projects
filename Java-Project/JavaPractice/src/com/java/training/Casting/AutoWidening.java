package com.java.training.Casting;

class AutoWidening
{
    static float methodOne(int i)
    {
        long j = i;     //int is auto widened to long
        return j;       //long is auto widened to float
    }
 
    public static void main(String[] args)
    {
        byte b = 10;
        short s = b;      //byte is auto widened to short
        double d = methodOne(s);    //short is auto widened to int and float to double
        System.out.println(d);
    }
}

// byte --> short --> int --> long --> float --> double
// 8 bits --> 16 bits --> 64 bits --> 32 bits --> 64 bits