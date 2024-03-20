package com.java.threads;

public class ThreadJoinExample extends Thread{  
	 public void run(){  
		  for(int i=1;i<=5;i++){  
			   try{  
				   Thread.sleep(500);  
			   }catch(Exception e){
				   System.out.println(e);
			   } 
			   System.out.println(Thread.currentThread().getName());
			  System.out.println(i);  
		  }  
	 }  
	public static void main(String args[]){  
		ThreadJoinExample t1=new ThreadJoinExample();  
		ThreadJoinExample t2=new ThreadJoinExample();  
		ThreadJoinExample t3=new ThreadJoinExample();  
		t1.start();  
		try{  
			t1.join();  
		}catch(Exception e){
			System.out.println(e);
		}  
	  
		t2.start();  
		t3.start();  
	 }  
}  

// In the above example,when t1 completes its task for 1500 miliseconds(3 times) 
// then t2 and t3 starts executing.