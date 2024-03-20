package com.java.array;

public class ArrayExample {
	
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		arr1[0] = 2531951;
		arr1[1] = 2531952;
		arr1[2] = 2531953;
		arr1[3] = 2531954;
		arr1[4] = 2531955;

		System.out.println("Emp ID of 2nd Employee: " + arr1[1]);
		arr1 = new int[6];
		System.out.println("Emp ID of 2nd Employee: " + arr1[1]);
		
		int[][] arr2 = new int[4][100];
		
		int[] arr3 = new int[]{2,4,5,6,7,8,9};
		
	}

}
