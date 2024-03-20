package com.java.multithread;

public class AccountHolder implements Runnable {
	private Account account;
	int withdrawAmount;
	
	public AccountHolder(Account account, int amount) {
		this.account = account;
		this.withdrawAmount = amount;
	}

	//without synchronization
	public synchronized void makewithdrawal(int withdrawAmount) {
		System.out.println("Initial Balance: " + account.getBalance());
//		synchronized(this) {
			if(account.getBalance() >= withdrawAmount) {
				System.out.println(Thread.currentThread().getName() +" is going to withdraw " + withdrawAmount);
				account.withdraw(withdrawAmount);
				System.out.println(Thread.currentThread().getName() +" Completes the withdrawal of  " + withdrawAmount);
	
			} else {
				System.out.println("Not enough funds in your Account for " + Thread.currentThread().getName() +" to withdraw " + withdrawAmount);
			}
//		}
		
		System.out.println("Final Balance: " + account.getBalance());
	}
	
	public void run() {
		for(int i=1; i<=1;i++) {
			
			if(account.getBalance() <0) {
				System.out.println("Your Account is Overdrwan");
			} else {
				makewithdrawal(withdrawAmount);
			}
			
		}
		
	}
	


}
