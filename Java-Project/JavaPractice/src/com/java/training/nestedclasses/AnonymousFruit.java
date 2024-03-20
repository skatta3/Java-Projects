package com.java.training.nestedclasses;

interface Fruit {
    void juice();
}
 
public class AnonymousFruit
{
    public static void main(String args[ ])
    {
        Fruit f = new Fruit( ){
            public void juice() {
                System.out.println("Yummy Fruit Juice!");
            }
        };
        f.juice();
    }
}
