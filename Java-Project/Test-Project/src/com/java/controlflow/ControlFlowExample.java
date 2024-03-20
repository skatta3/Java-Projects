package com.java.controlflow;

public class ControlFlowExample {
	public static void main(String[] args) {
		int st1Marks = 60;
		int st2Marks = 70;
		
		if(st1Marks >= 35) {
			if(st1Marks >= 60 && st1Marks <= 75) {
				System.out.println("Student1 Passed in First Class");
			} else if(st1Marks >= 50 && st1Marks < 60) {
				System.out.println("Student1  passed in Second Class");
			} else if(st1Marks >= 35 && st1Marks < 50) {
				System.out.println("Student1  passed in Third Class");
			}
		} else {
				System.out.println("Student1  Failed");
		}
				
	}

}
