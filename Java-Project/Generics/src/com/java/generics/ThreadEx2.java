package com.java.generics;

public class ThreadEx2 extends Employee implements Runnable{
	public void run() {
		for(int i=1; i<=10;i++) {
			if(i%2 == 0)
					System.out.println(i + " is an even number");
		}		
	}
	public static void main(String[] args) {
		ThreadEx2 t2 = new ThreadEx2();
		Thread t12 = new Thread(t2);
		t12.start();
	}
}
