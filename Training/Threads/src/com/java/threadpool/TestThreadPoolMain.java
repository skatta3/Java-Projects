package com.java.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPoolMain {
    public static void main(String[] args) {  
       ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
       for (int i = 0; i < 10; i++) {  
           Runnable worker = new TestThreadPool("" + i);  //My Tasks
           executor.execute(worker);//calling execute method of ExecutorService  , Passing the Task to Thread Pool
         }  
       executor.shutdown();  
       while (!executor.isTerminated()) {   }  
 
       System.out.println("Finished all threads");  
   }  
}  