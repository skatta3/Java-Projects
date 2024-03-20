package com.java.training.enums;

enum enums
{
    A, B, C;
 
    int i;  //enums can have fields
 
    private enums()
    {
        //enums can have Constructor
    }
 
    void methodOfEnum()
    {
       System.out.println("Calling enum Method");
    }
}
 
public class EnumsExample1
{
    public static void main(String[] args)
    {
        enums en = enums.A;
        System.out.println(en.i);  //Constant A has field i
        en.methodOfEnum();         //Constant A has methodOfEnum()
 
        enums en1 = enums.B;
        System.out.println(en1.i);  //Constant B has field i
        en1.methodOfEnum();         //Constant B has methodOfEnum()
 
        enums en2 = enums.C;
        System.out.println(en2.i);   //Constant C has field i
        en2.methodOfEnum();          //Constant C has methodOfEnum()
    }
}