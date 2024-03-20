package com.java.arraysclass;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) 
    { 
        // define the Array 
        int numArr[] = { 23,43,26,65,35,16,74,27,98 }; 
        //sort the array first
        Arrays.sort(numArr); 
        System.out.println("Input array:" + Arrays.toString(numArr));
 
         int key = 35; 
        //call binarySearch function to search a given key
         System.out.println("Key " + key + " found at index = " + Arrays.binarySearch(numArr, key)); 
    } 
}