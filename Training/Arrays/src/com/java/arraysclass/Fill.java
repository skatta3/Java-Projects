package com.java.arraysclass;

import java.util.Arrays;

public class Fill {
    public static void main(String[] args) {
        // define the array
        int[] intArray = { 1, 3, 5, 7 };
        //print original array
        System.out.println("The original array: " + Arrays.toString(intArray));
        //call fill method to fill the array with all zeros     
        Arrays.fill(intArray, 0);
        //print altered array
        System.out.println("Array after call to fill:" + Arrays.toString(intArray));
    }       
}