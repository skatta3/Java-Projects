package com.training.java;



	// Java program to illustrate creating an array 
	// of integers,  puts some values in the array, 
	// and prints each value to standard output. 
	  
public class ArrayExample {
	    public static void main (String[] args)  
	    {          
	      int[] arr = new int[5];
	      arr[0] = 10;           
	      arr[1] = 20; 
	      arr[2] = 30; 
	      arr[3] = 40; 
	      arr[4] = 50; 

	 System.out.println("Element at index " + 0 +  " : "+ arr[0]); 
	 System.out.println("Element at index " + 1 +  " : "+ arr[1]); 
	 System.out.println("Element at index " + 2 +  " : "+ arr[2]); 
	 System.out.println("Element at index " + 3 +  " : "+ arr[3]); 
	 System.out.println("Element at index " + 4 +  " : "+ arr[4]); 
	 
	 System.out.println("------------------------------------");
     String[] daysofWeek = new String[7];
     daysofWeek[0] = "Monday";           
     daysofWeek[1] = "Tuesday"; 
     daysofWeek[2] = "Wednesday"; 
     daysofWeek[3] = "Thursday"; 
     daysofWeek[4] = "friday"; 
     daysofWeek[5] = "Saturday"; 
     daysofWeek[6] = "Sunday"; 
     
     boolean weekDay = true;
     if(weekDay) {
    	 System.out.println("Good Morning");
     } else {
    	 System.out.println("Good Evening");
     }

//System.out.println("Element at index " + 0 +  " : "+ daysofWeek[0]); 
//System.out.println("Element at index " + 1 +  " : "+ daysofWeek[1]); 
//System.out.println("Element at index " + 2 +  " : "+ daysofWeek[2]); 
//System.out.println("Element at index " + 3 +  " : "+ daysofWeek[3]); 
//System.out.println("Element at index " + 4 +  " : "+ daysofWeek[4]); 
//System.out.println("Element at index " + 5 +  " : "+ daysofWeek[5]); 
//System.out.println("Element at index " + 6 +  " : "+ daysofWeek[6]); 
     
     for (int i = 0; i < daysofWeek.length; i++) 
         System.out.println("Element at index " + i +  " : "+ daysofWeek[i]);           
    
	      
	    }
	} 