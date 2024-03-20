package com.java.throwskw;

public class TestClass1 {
	TestClass2 tc2 = new TestClass2();
	public static void main(String[] args) {
		TestClass1 tc1 = new TestClass1();
		tc1.TestMethod1();
	}

	public void TestMethod1() {
		System.out.println("This is Test Method1");
		try {
			tc2.TestMethod2();
		} catch(Exception e) {
			System.out.println("Arithmetic Exception");
		}
		
	}
}
