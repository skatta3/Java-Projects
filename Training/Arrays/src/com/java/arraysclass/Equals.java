package com.java.arraysclass;

import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {
        // define two arrays, array_One and array_Two
        int[] array_One = { 1, 3, 5, 7 };
        int[] array_Two = { 1, 3, 5, 7 };
        //print the arrays
        System.out.println("array_One = " + Arrays.toString(array_One));
        System.out.println("array_Two = " + Arrays.toString(array_Two));
        //use equals method to check for equality of arrays     
        boolean array_equal = Arrays.equals(array_One, array_Two);
        //print the results
        
        if (array_equal) {
            System.out.println("equals method returns " + array_equal + 
            ", hence arrays array_One and array_Two are equal\n");  
        }else {
            System.out.println("equals method returns " + array_equal + 
            ", hence arrays array_One and array_Two are not equal\n");
        }
        // define two more arrays, firstArray&secondArray
        int[] firstArray = { 2, 4, 6, 8 };
        int[] secondArray = { 1, 3, 5, 7};
         //display these arrays
        System.out.println("firstArray = " + Arrays.toString(firstArray));
        System.out.println("secondArray = " + Arrays.toString(secondArray));
        //use equals method to check equality of arrays     
        boolean test_array = Arrays.equals(firstArray, secondArray);
         
        //print the results
        if (test_array) {
            System.out.println("equals method returns " + test_array + 
            ", hence arrays firstArray and secondArray are equal\n");   
 
        }else {
            System.out.println("equals method returns " + test_array + 
            ", hence arrays firstArray and secondArray are not equal\n");
        }
    }
}