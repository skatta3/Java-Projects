package com.java.interthread;

class Customer{  
	int balance=10000;  
  
	 synchronized void withdraw(int withdrawamount){  
			System.out.println("going to withdraw...");  
			if(this.balance < withdrawamount){  
				System.out.println("Less balance; waiting for deposit...");  
				try{
					wait();
				}catch(Exception e)
				{}  
			}  
			this.balance -= withdrawamount;  
			System.out.println("withdraw completed...");  
			System.out.println("Available Balance: " + this.balance);
	}  
  
	 synchronized void deposit(int amount){  
		System.out.println("going to deposit...");  
		this.balance += amount;  
		System.out.println("deposit completed... ");  
		notify();  
	}  
}  
  
public class WithdrawCash{  
	public static void main(String args[]){  
		final Customer c=new Customer();  
		new Thread(){  
			public void run(){
				c.withdraw(15000);
			}  
		}.start();  
		new Thread(){  
			public void run(){
				c.deposit(10000);
			}  
		}.start();  
	}
}  