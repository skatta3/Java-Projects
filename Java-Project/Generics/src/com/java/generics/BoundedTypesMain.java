package com.java.generics;

public class BoundedTypesMain {
	  public static void main(String[] args) {

		    // create an object of GenericsClass
		    GenericsClassBT<String> obj = new GenericsClassBT<>();
		    obj.display();
		  }
}
class GenericsClassBT <T extends Number> {

	  public void display() {
	    System.out.println("This is a bounded type generics class.");
	  }
	}