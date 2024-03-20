package com.java.forloop;

public class ForEachLoopExample {

 public static void main(String[] arg)
 {
     {
         int[] marks = { 125, 132, 95, 116, 110 };
          
         int highest_marks = maximum(marks);
         System.out.println("The highest score is " + highest_marks);
     }
 }
 public static int maximum(int[] numbers)
 {
     int maxSoFar = numbers[0];
      
     // Advanced for loop
     for (int num : numbers)
     {
         if (num > maxSoFar)
         {
             maxSoFar = num;
         }
     }
     return maxSoFar;
 }
}