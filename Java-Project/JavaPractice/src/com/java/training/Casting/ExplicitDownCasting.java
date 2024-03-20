package com.java.training.Casting;

class AA
{
    int i = 10;
}
 
class BB extends AA
{
    int j = 20;
}
 
class CC extends BB
{
    int k = 30;
}
 
class DD extends CC
{
    int m = 40;
}
 
public class ExplicitDownCasting
{
    public static void main(String[] args)
    {
        AA a = new AA();
//        BB b = (BB) a;   //A type is explicitly downcasted to B type
        CC c = (CC) a;   //A type is explicitly downcasted to C type
        DD d = (DD) a;   //A type is explicitly downcasted to D type
        BB b1 = new BB();
        DD d1 = (DD) b1;  //B type is explicitly downcasted to D type
        d1 = (DD) new CC();  //C type is explicitly downcasted to D type
    }
}