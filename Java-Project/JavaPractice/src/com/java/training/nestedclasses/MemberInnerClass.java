package com.java.training.nestedclasses;

public class MemberInnerClass {  //Outer Class
	private String data = "My program defines member inner class";
	
    class Inner  //Inner Class
    {
        void print()
        {
            System.out.println(data);
        }
    }
 
  
    public static void main(String args [] )
    {
    	MemberInnerClass o = new MemberInnerClass(); // Instance of Outer Class
    	MemberInnerClass.Inner i = o.new Inner(); //To create the Instance of Inner class
        i.print();
    }
}
