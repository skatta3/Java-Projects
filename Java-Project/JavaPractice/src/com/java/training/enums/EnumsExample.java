package com.java.training.enums;

enum Directions
{
    NORTH, SOUTH, EAST, WEST;
}
 
public class EnumsExample
{
    public static void main(String[] args)
    {
 //       Directions d1 = Directions.EAST;
        System.out.println(Directions.EAST);
 
//        Directions d2 = Directions.NORTH;
        System.out.println(Directions.NORTH);
 
        System.out.println(Directions.SOUTH);
 
        System.out.println(Directions.WEST);
    }
}