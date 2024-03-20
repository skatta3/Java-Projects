package com.java.interthread1;

	class Queue {
		int num;
		boolean valueSet = false;
		public synchronized void put(int num)  {
			while(valueSet) {
				try {
				wait();
				} catch(Exception e) {

				}
			}
			System.out.println("Placing the Product number : " + num);
			this.num = num;
			valueSet = true;
			notify();
		}
		public synchronized void get() 
		{
			while(!valueSet) {
			try {
			wait();
			} catch(Exception e) {

			}
			}
			System.out.println("Picking the Product Number : " + num);
			valueSet=false;
			notify();

	}
	}

class Producer implements Runnable  //Making this class as Thread
	{
	Queue queue;
	public Producer(Queue queue) 
	{
		this.queue = queue;
		Thread t = new Thread(this,"Producer");
		t.start();
	}
	public void run() 
		{
		int i =0;
			while(i <= 10)
			{
				queue.put(i++);
				try {
					Thread.sleep(1000);
					} catch(Exception e) 
					{

					}
			}
		}
	}
class Consumer implements Runnable //Making this class as Thread
{
	Queue queue;
	public Consumer(Queue queue) 
	{
		this.queue = queue;
		Thread t = new Thread(this,"Consumer");
		t.start();
	}
	public void run() 
		{
			while(true)
			{
				queue.get();
				try {
					Thread.sleep(1000);
					} catch(Exception e) {

					}
			}
		}
}

public class IThread {

	public static void main(String[] args) {
		Queue queue = new Queue();
		new Producer(queue);
		new Consumer(queue);
	}
}
 
