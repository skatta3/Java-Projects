package com.java.collections;

import java.util.*;

public class TestVector {
	   public static void main(String args[]) {
	      /* Vector of initial capacity(size) of 2 */
	      //Vector<String> vec = new Vector<String>(2);
	      Vector<String> vec = new Vector<String>();

	      /* Adding elements to a vector*/
	      vec.addElement("Apple");
	      vec.addElement("Orange");
	      vec.addElement("Mango");
	      vec.addElement("Fig");
	      
	      //Thread Safety
	      // Ordering
	      //Duplicate Elements are allowed


	      /* check size and capacityIncrement*/
	      System.out.println("Size is: "+vec.size());
	      System.out.println("Default capacity increment is: "+vec.capacity());

	      vec.addElement("fruit1");
	      vec.addElement("fruit2");
	      vec.addElement(12);

	      /*size and capacityIncrement after two insertions*/
	      System.out.println("Size after addition: "+vec.size());
	      System.out.println("Capacity after increment is: "+vec.capacity());
	      
	      vec.addElement("123");
	      vec.addElement("22");
	      vec.addElement(45);
	      vec.addElement("67");
	      vec.addElement("fruit2");
	      vec.addElement(12);
	      
	      System.out.println("Size after addition: "+vec.size());
	      System.out.println("Capacity after increment is: "+vec.capacity());

	      /*Display Vector elements*/
	      Enumeration en = vec.elements();
	      System.out.println("\nElements are:");
	      while(en.hasMoreElements())
	         System.out.print(en.nextElement() + " ");
	   }
	}

