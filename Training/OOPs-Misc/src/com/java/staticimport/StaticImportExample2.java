package com.java.staticimport;

import static java.lang.Math.*;

public class StaticImportExample2  {
//	   public static void main(String args[])
//	   {
//	      double var1= Math.sqrt(5.0);
//	      double var2= Math.tan(30);
//	      System.out.println("Square of 5 is:"+ var1);
//	      System.out.println("Tan of 30 is:"+ var2);
//	   }
	   
	   public static void main(String args[])
	   {
	      //instead of Math.sqrt need to use only sqrt
	      double var1 = sqrt(5.0);
	      //instead of Math.tan need to use only tan
	      double var2 = tan(30);
	      //need not to use System in both the below statements
	      System.out.println("Square of 5 is:"+var1);
	      System.out.println("Tan of 30 is:"+var2);
	   }
}
