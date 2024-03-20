package com.java.regex;

import java.util.regex.*;
public class MetacharExample{
  public static void main(String args[]){
    // d means digit
//    System.out.println("metacharacters d...."); 
//    //(non-digit)
//    System.out.println(Pattern.matches("\\d*", "ABCDabcd2345"));//Output: false 

//    //(digit and comes once)
//    System.out.println(Pattern.matches("d", "1"));//Output: true 
//
//    //(digit but comes more than once)
//    System.out.println(Pattern.matches("dddd", "4443")); //Output: false
//
//    //(digit and char)
//    System.out.println(Pattern.matches("d", "323abc"));//Output: false
//    //D means non-digit
//    System.out.println("metacharacters D....");
//
    //(non-digit but comes more than once)
    System.out.println(Pattern.matches("\\D", "a")); // Output: false
//
//    //Its a Digit
//    System.out.println(Pattern.matches("D", "1")); //Output: false 
//    System.out.println(Pattern.matches("D", "4443")); //Output: false 
//
//    // (digit and char)
//    System.out.println(Pattern.matches("D", "323abc")); //Output: false
//    //(non-digit and comes once)
//    System.out.println(Pattern.matches("D", "m")); //Output: true 
//
//    System.out.println("metacharacters D with quantifier....");
//    //(non-digit and may come 0 or more times)
//    System.out.println(Pattern.matches("D*", "abc")); //Output: true 

  }
}