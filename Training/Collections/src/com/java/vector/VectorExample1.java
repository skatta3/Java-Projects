package com.java.vector;

import java.util.Enumeration;
import java.util.Vector;  
public class VectorExample1 {  
   public static void main(String args[]) {  
      //Create a vector  
      Vector<String> vec = new Vector<String>();  
      //Adding elements using add() method of List  
      vec.add("Tiger");  
      vec.add("Lion");  
      vec.add("Dog");  
      vec.add("Elephant");  
      //Adding elements using addElement() method of Vector  
      vec.addElement("Rat");  
      vec.addElement("Cat");  
      vec.addElement("Deer");  
        
      System.out.println("Elements are: "+vec);  
      
      Enumeration en = vec.elements();
      System.out.println("Vector elements are: ");
      while(en.hasMoreElements())
         System.out.println(en.nextElement());
    
   }  
}  