package com.java.arraysclass;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        // define the array
        int[] intArray = {10,4,25,63,21,51,73,24,87,18};
        //print original array
        System.out.println("The original array: " + Arrays.toString(intArray));
        //call sort method to sort the given array in ascending order       
        Arrays.sort(intArray);
        //print altered array
        System.out.println("Sorted array:" + Arrays.toString(intArray));
    }       
}