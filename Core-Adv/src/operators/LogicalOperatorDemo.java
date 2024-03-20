package com.java.operators;

public class LogicalOperatorDemo {
		   public static void main(String args[]) {
		      boolean b1 = true;
		      boolean b2 = true;

		      System.out.println("b1 && b2: " + (b1 && b2));
		      System.out.println("b1 || b2: " + (b1 || b2));
		      System.out.println("!(b1 && b2): " + !(b1 && b2));
		      
		      String Qualification = "Engineering";
		      String skillset = "Python";
		      if ((Qualification=="Engineering" && skillset == "Java")) {
		    	  System.out.println("Call for Interview");
		      } else {
		    	  System.out.println("Not eligible for the Interview");
		      }
		      
		   }
}
