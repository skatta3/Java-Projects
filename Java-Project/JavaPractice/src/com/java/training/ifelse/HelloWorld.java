package com.java.training.ifelse;

public class HelloWorld {


	public static void main(String[] args) {
		System.out.println("Welcome to Hello World");
		HelloWorld hw = new HelloWorld();
	
		boolean checkFlag = false;
		char empName="xyz";
		int age = 26;
		
		
		if(checkFlag)
			hw.Calculate(2, 4);
		else if (!checkFlag)
			hw.Calculate(22, 44);
		else
			hw.Calculate(112, 422);
	}

	public void Calculate(int i, int j) {
		
		System.out.println(i + j);
	}
}
