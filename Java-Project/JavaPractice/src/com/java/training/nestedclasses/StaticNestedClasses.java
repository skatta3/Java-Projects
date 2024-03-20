package com.java.training.nestedclasses;

public class StaticNestedClasses {
	    static String data = "Static Inner Class";
	     
	    static class Inner {
		    void print() {
		        System.out.println(data);
		    }
	    }
	    public static void main(String args []) {
	    	StaticNestedClasses.Inner obj = new StaticNestedClasses.Inner();
	        obj.print();
	    }
}
