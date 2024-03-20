package com.java.srraysort;

/**
 * Sorting Primitive Data types with Parallel Sort
 */
import java.util.Arrays;
import java.util.Collections; 
public class ArraySortExample1 {  
   public static void main(String[] args) {
		int numbers[] = {22, 89, 1, 32, 19, 5};
		
//		Arrays.sort(numbers);
//		
//		for (int i : numbers) {
//			System.out.println(i);
//		}
		
//		//Parallel Sort method for sorting int array
		Arrays.parallelSort(numbers);
//		//converting the array to stream and displaying using forEach
		Arrays.stream(numbers).forEach(n->System.out.print(n+" "));
		
//		System.out.println("\nMaximum Number is " + numbers[numbers.length-1]);
//		System.out.println("Minimum Number is " + numbers[0]);
    }
}
