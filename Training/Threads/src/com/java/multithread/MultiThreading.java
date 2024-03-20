package com.java.multithread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MultiThreading {  	
	public static void main(String[] args) {

	    BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);
	
	    ReaderThread reader = new ReaderThread(queue);
	    WriterThread writer = new WriterThread(queue);
	
	    new Thread(reader).start();
	    new Thread(writer).start();
  }
}

