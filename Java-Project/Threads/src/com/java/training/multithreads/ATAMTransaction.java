package com.java.training.multithreads;

public class ATAMTransaction {
	
	public static void main(String[] args) {
		
		Account account = new Account();
		AccountHolder accountHolder = new AccountHolder(account,3500);

		
		Thread t1 = new Thread(accountHolder);  //I am going to withdraw
		Thread t2 = new Thread(accountHolder); // My spouse is going to withdraw
		t1.setName("Self");
		t2.setName("Partner");
		
		t1.start();
		t2.start();
	}

}
