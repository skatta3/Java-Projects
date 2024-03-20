package com.java.MDA;

public class MDArray {
	 public static void main(String[] args)
	    {
	     int[][] arr = { { 1, 2 }, { 3, 4 } };
	     
	     arr[0][0] = 12;
	     arr[0][1] = 24;
	     arr[1][0] = 15;
	     arr[1][1] = 30;
	     
	     
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	  
	            System.out.println();
	        }
	    }
}
