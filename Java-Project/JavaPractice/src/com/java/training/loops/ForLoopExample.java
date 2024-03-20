package com.java.training.loops;

public class ForLoopExample {
	 public static void main(String args[]) 
	    { 
	        // for loop begins when x=2 
	        // and runs till x <=4 
	        for (int x = 2; x <= 5; x++) {
	            System.out.println("Value of x:" + x); 
	            if(x == 3)
	            	continue;
	            System.out.println("Calculating the Bonus of the Employee");
	
	        }
	        ForLoopExample fe = new ForLoopExample();
	        float bonusvalue = fe.calulateBonus(12, 10000, "EXCELLENT");
	    }
	 
	 public float calulateBonus (int empID, float salary, String Rating) {
		 float bonus=0;
		 if (Rating == "EXCELLENT") {
			 bonus = salary * 2;
		 } else if (Rating == "VERY GOOD") {
			 bonus = salary * 1;
		 } else if (Rating == "AVERAGE") {
			 bonus = salary * 0.5f;
		 }
		 
		 return bonus;
		 
	 }
}
