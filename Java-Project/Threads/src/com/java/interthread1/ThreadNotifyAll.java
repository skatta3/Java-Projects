package com.java.interthread1;

class Reader extends Thread   
{  
    public void run()  
    {  
        synchronized(this)  
        {  
            System.out.println("Starting of " + Thread.currentThread().getName());  
            try {  
                this.wait();  
            }  
            catch (InterruptedException e) {  
                e.printStackTrace();}  
            System.out.println(Thread.currentThread().getName() + "...notified");  
        }  
    }  
}  
class Writer extends Thread {  
	Reader reader;  
    Writer(Reader reader)  
    {  
        this.reader = reader;  
    }  
    public void run()  
    {  
        synchronized(this.reader)  
        {  
            System.out.println("Starting of " + Thread.currentThread().getName());  
            try {  
                this.reader.wait();  
            }  
            catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
            System.out.println(Thread.currentThread().getName() + "...notified");  
        }  
    }  
}   
class Upload extends Thread   
{  
    Reader reader;  
    Upload(Reader reader)  
    {  
        this.reader = reader;  
    }  
    public void run()  
    {  
        synchronized(this.reader)  
        {  
            System.out.println("Starting of " + Thread.currentThread().getName());  
            // call the notifyAll() method  
            this.reader.notifyAll();  
            System.out.println(Thread.currentThread().getName() + "...notified");  
        }  
    }  
}  
public class ThreadNotifyAll   
{  
    public static void main(String[] args) throws InterruptedException  
    {  
        Reader reader = new Reader();  
        Writer writer = new Writer(reader);  
        Upload upload = new Upload(reader);  
          
        // creating the threads   
        Thread t1 = new Thread(reader, "Thread-1");  
        Thread t2 = new Thread(writer, "Thread-2");  
        Thread t3 = new Thread(upload, "Thread-3");  
          
        // call run() method  
        t1.start();  
        t2.start();  
        Thread.sleep(100);  
        t3.start();  
    }  
}  