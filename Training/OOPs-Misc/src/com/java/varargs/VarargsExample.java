package com.java.varargs;

public class VarargsExample {

    public static void main(String[] args) {
        System.out.println(sum(1));
        System.out.println(sum(1,2)); 
        System.out.println(sum(1,2,3,4,5,6)); 
//        int[] arr1 = new int[] {2,3,4,5};
//        System.out.println(sumArray(1,arr1)); 


    }
	//method with variable arguments
	public static int sum(int i, int...js ){
		System.out.println("First Method");
	    int sum = i;
	    for(int x : js){
	        sum+=x;
	    }
	    return sum;
	}

	//method with same implementation as sum with array as argument
	public static int sumArray(int i, int[] js ){
		System.out.println("Second Method");
	    int sum = i;
	    for(int x : js){
	        sum+=x;
	    }
	    return sum;
	}
	
	
}
