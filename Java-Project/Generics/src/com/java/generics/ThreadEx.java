package com.java.generics;

public class ThreadEx extends Thread{
	
	public void run() {		//Running
		for(int i=1; i<=10;i++) {
			if(i%2 == 0)
					System.out.println(i + " is an even number");
			
			try {
				Thread.sleep(2000);  //Non-Runnable
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} //Dead or Terminated
	}
	
	public static void main(String[] args) {
		ThreadEx t1 = new ThreadEx();		//New
		t1.start();		//Runnable
	}
}
