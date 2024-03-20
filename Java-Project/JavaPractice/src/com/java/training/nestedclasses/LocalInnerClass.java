package com.java.training.nestedclasses;

public class LocalInnerClass {
    private String data = "This is an instance variable.";
 
    void printData() {
        int number = 25; //Local variable of this method
 
        //Method Local inner Class
        class LocalDemo {
          void displayMsg() {
        	  int number1 = number + 25;
            System.out.println(data);
            System.out.println("This is a local variable:" +number);
            System.out.println("This is a local variable of Inner Class:" +number1);
          }
        }
 
        LocalDemo obj = new LocalDemo();
        obj.displayMsg();
    }
    
    public static void main(String args []) {
    	LocalInnerClass e = new LocalInnerClass();
        e.printData();
    }
}
