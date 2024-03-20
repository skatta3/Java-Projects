package com.java.training.arrays;

import java.util.Date;

public class ArrayExample {
	Date date = new Date();
	
	public static void main(String[] args) {
		//Declaring the Array
		int[] arr = new int[3];
		int arr1[] = new int[3];  // Not Preferred way
		
		int arr2[] = {2,3,4,5,6};
		
		//Add Elements to Array
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
//		arr[3] = 120;
		
		
		
		
		
//		try {
//			arr[3] = 40;
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		
		System.out.println("Array Element at Index 0 " + arr[0]);
		System.out.println("Array Element at Index 1 " + arr[1]);
		System.out.println("Array Element at Index 2 " + arr[2]);

		
		arr = new int[4];
			System.out.println("Array has been Re-initialized to 4");
			System.out.println("Array Element at Index 0 " + arr[0]);
			System.out.println("Array Element at Index 1 " + arr[1]);
			System.out.println("Array Element at Index 2 " + arr[2]);

		
		arr[0] = 20;
		arr[1] = 12;
		arr[2] = 8;
		arr[3] = 43;
		
		int[][] mdArr = new int[3][3];
//		
//////		System.out.println("Current Date:" + new Date());
////		
////		//Display Array Elements
//		System.out.println("Array Element at Index 0 " + arr[0]);
//		System.out.println("Array Element at Index 1 " + arr[1]);
//		System.out.println("Array Element at Index 2 " + arr[2]);		
//		System.out.println("Array Element at Index 3 " + arr[3]);
//		
////		
////	Declaration and Initialization
		int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,10 }; 
//////		
////		System.out.println("intArray-------------------");
//////		
////////		System.out.println("Array Element at Idnex 0 " + intArray[0]);
////////		System.out.println("Array Element at Idnex 1 " + intArray[1]);
////////		System.out.println("Array Element at Idnex 2 " + intArray[2]);
//////		
		   for(int x : intArray ) {
		         System.out.println( x );
		      }
		   
		   System.out.println("-----------------------------");
		   for(int i = 0; i< intArray.length; i++) {
			   System.out.println(intArray[i]);
		   }
//		
//		// Advanced For Loop
//		System.out.println("Advanced For Loop");
//		for(int x : arr) {
//			System.out.println(x);
//		}
//		
//		 for(int i = 0; i< arr.length; i ++) {
//			   System.out.println(arr[i]);
//		   }
	}

}
