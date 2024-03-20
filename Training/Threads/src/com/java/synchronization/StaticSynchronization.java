package com.java.synchronization;

class Table2{   
	 synchronized static void printTable(int n){  
	   for(int i=1;i<=10;i++){  
	     System.out.println(n*i);  
	     try{  
	       Thread.sleep(400);  
	     }catch(Exception e){}  
	   }  
	 }  
	}  
	  
class MyThread11 extends Thread{  
	public void run(){  
		Table2.printTable(1);  
	}  
}  
	  
class MyThread22 extends Thread{  
	public void run(){  
		Table2.printTable(10);  
	}  
}  
	  
class MyThread3 extends Thread{  
	public void run(){  
		Table2.printTable(100);  
	}  
}  
	  
class MyThread4 extends Thread{  
	public void run(){  
		Table2.printTable(1000);  
	}  
}  
	  
public class StaticSynchronization{  
	public static void main(String t[]){  
		MyThread11 t1=new MyThread11();  
		MyThread22 t2=new MyThread22();  
		MyThread3 t3=new MyThread3();  
		MyThread4 t4=new MyThread4();  
		t1.start();  
		t2.start();  
		t3.start();  
		t4.start();  
	}  
}  