package com.java.banking;

import java.util.Date;
/** 
 * 
 * @author skatt
 *
 */

public final class Account {
	//Variables OR Properties OR fields OR attributes
	//Instance Variables
	private int accountID;  //Default
	private String accountName;
	private float balance;
	private String accountType;
	
	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	final static String country = "USA";
	
	
	//Default or No-argument constructor
	public Account() {
		System.out.println("Default constructor of Account Class");
		System.out.println("Today's Date is : " + new Date());
	}
	
	// Argument Constructor
	public Account(int id, String name, float bal, String type) {
		this.accountID = id;
		this.accountName = name;
		this.balance = bal;
		this.accountType = type;
	}
	
	public void displayAccountInfo() {
		String bankName = "DCU"; //Local Variable
		System.out.println("Account Details");
		System.out.println("Account ID: " + this.accountID);
		System.out.println("Account Name: " + this.accountName);
		System.out.println("Account Balance: " + this.balance);
		System.out.println("Account Type: " + this.accountType);
//		System.out.println("Country: " + this.country);

		System.out.println("-------------------------------");
	}
	
	public int sum(int x, int y) {
		return x + y;
	}
	public int sum(int x, int y, int z) {
		return x + y + z;
	}
	public int sum(int x, int y, int z, int p) {
		return x + y + z + p;
	}
	
	//Overriden Method
	public void depositRates() {
		float termDeposit = 7.5f;
		float seniorDeposit = 8;
		
		//return SmartPhone
	}

}

