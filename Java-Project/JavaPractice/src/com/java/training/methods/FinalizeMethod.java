package com.java.training.methods;

import java.util.Date;
import java.util.GregorianCalendar;

public class FinalizeMethod extends GregorianCalendar {

		   public static void main(String[] args) {
			   
			   System.out.println("Today's Date is: " + new Date());
		      try {
		         // create a new ObjectDemo object
		    	  FinalizeMethod cal = new FinalizeMethod();

		         // print current time
		         System.out.println("" + cal.getTime());

		         // finalize cal
		         System.out.println("Finalizing...");
		         cal.finalize();
		         System.out.println("Finalized.");

		      } catch (Throwable ex) {
		         ex.printStackTrace();
		      }
		   }
}
