package com.java.loops;

public class ForLoopExample {
	public static void main(String[] args) {
		
//		for(int i=1, j=1; i<=10; i++) {
//			if(i % 2 == 0)
//				System.out.println(i + " is an even number");
//			else
//				System.out.println(i + " is an odd number");
//		}
		
		int j = 1;
		while(j <= 10) {
			j++;
			if(j==4)
				continue;
			if(j % 2 == 0)
				System.out.println(j + " is an even number");
			else
				System.out.println(j + " is an odd number");	
		}
		
		
//		do {
//			if(j % 2 == 0)
//				System.out.println(j + " is an even number");
//			else
//				System.out.println(j + " is an odd number");	
//			
//			if(j ==4)
//				break;
//			
//			j++;
//		} while(j <= 10);
	}

}
