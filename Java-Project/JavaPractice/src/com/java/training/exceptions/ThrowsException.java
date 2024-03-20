package com.java.training.exceptions;

public class ThrowsException {
    public static void main(String[] args)
    {
 //   	methodWithThrows();
        try
        {
            methodWithThrows();
        }
        catch(NullPointerException ex)
        {
            System.out.println("NullPointerException thrown by methodWithThrows() method will be caught here");
        }
    }
 
    static void methodWithThrows() throws NullPointerException
    {
        String s = null;
        System.out.println(s.length());   //This statement throws NullPointerException
    }
}
