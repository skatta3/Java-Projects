package com.java.training.string;

/*
Java StringBuffer Example
This example shows how java StringBuffer can be built and created using
different constructors of Java StringBuffer class.
*/


public class JavaStringBufferExample {

public static void main(String[] args) {
 /*
   Java StringBuffer is a mutable sequence of characters.
   Difference between Java String and StringBuffer is that StringBuffer
   can be modified while String can not.
   
   Java StringBuffer can buit using one of the following constructors
 */
 
 /*
 1. StringBuffer StringBuffer()
 Construct empty StringBuffer with initial capacity of 16
 */
 
 StringBuffer sbObj1 = new StringBuffer();
 
 /*
 2. StringBuffer StringBuffer(int length)
 Constructs empty StringBuffer with initial capacity of length
 */
 StringBuffer sbObj2 = new StringBuffer(10);
 
 /*
 3. StringBuffer StringBuffer(String str)
 constructs StringBuffer with the contents same as argument String
 */
 StringBuffer sbObj3 = new StringBuffer("Hello World Test");
 System.out.println(sbObj3);
 System.out.println(sbObj3.length());
 System.out.println(sbObj3.capacity());
 
 sbObj3 = sbObj3.append(" Muaz Training for Java");
 System.out.println(sbObj3);
 System.out.println(sbObj3.length());
 System.out.println(sbObj3.capacity());
 
}
}