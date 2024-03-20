package com.java.regex;

import java.util.regex.*;
public class CharacterExample{
  public static void main(String args[]){     
    //false (not x or y or z)
    System.out.println(Pattern.matches("[xyz]", "wbcd"));
    
    
    //true (among x or y or z)
    System.out.println(Pattern.matches("[xyz]", "x"));
    
    //false (x and y comes more than once)
    System.out.println(Pattern.matches("[xyz]", "xxyyyyyz"));
  }
}