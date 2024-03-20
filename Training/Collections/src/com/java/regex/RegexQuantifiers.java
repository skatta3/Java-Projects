package com.java.regex;

import java.util.regex.Pattern;
public class RegexQuantifiers{
  public static void main(String args[]){
    System.out.println("? quantifier ....");

//    //(a or y or z comes one time)
//    System.out.println(Pattern.matches("[ayz]?", "a")); //output: true
//    System.out.println(Pattern.matches("[ayz]*", "aaa")); 

//    //(a y and z comes more than one time)
//    System.out.println(Pattern.matches("[ayz]?", "ayyyyzz")); //output: false
//
//    //(a comes more than one time)
//    System.out.println(Pattern.matches("[ayz]?", "amnta")); //output: false
//
//    //(a or y or z must come one time)
//    System.out.println(Pattern.matches("[ayz]?", "ay")); //output: false 
//    System.out.println("+ quantifier ....");
//
//    //(a or y or z once or more times)
    System.out.println(Pattern.matches("[ayz]+", "aaayyyyacyz")); //output: true
//
//    //(a comes more than one time)
//    System.out.println(Pattern.matches("[ayz]+", "aaa")); //outpu: true
//
//    //(a or y or z comes more than once)
//    System.out.println(Pattern.matches("[amn]+", "aayyyzz")); //output: true
//
//    //(z and t are not matching pattern)
//    System.out.println(Pattern.matches("[ayz]+", "aammta")); //output: false
//    System.out.println("* quantifier ....");
//
//    //(a or y or z may come zero or more times)
//    System.out.println(Pattern.matches("[ayz]*", "ayyyza")); //output: true
 }
}