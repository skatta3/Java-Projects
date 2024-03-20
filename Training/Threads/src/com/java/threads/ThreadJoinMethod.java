package com.java.threads;

public class ThreadJoinMethod extends Thread{  
	 public void run(){  
		  for(int i=1;i<=5;i++){  
//			   try{  
//				   Thread.sleep(500);  
//			   }catch(Exception e){
//				   System.out.println(e);
//			   }  
			   System.out.println(Thread.currentThread().getName() + " The Value of i is: " + i);
		  }  
	 }  
	public static void main(String args[]){  
		ThreadJoinMethod t1=new ThreadJoinMethod();  
		ThreadJoinMethod t2=new ThreadJoinMethod();  
		ThreadJoinMethod t3=new ThreadJoinMethod();  

		 t1.setName("Thread-1");
		 t2.setName("Thread-2");
		 t3.setName("Thread-3");
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

// As you can see in the above example,when t1 completes its task then t2 and t3 
// starts executing.
