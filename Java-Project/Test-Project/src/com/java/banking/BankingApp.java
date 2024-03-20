package com.java.banking;

public class BankingApp { //Same Package Non-sub class
	public static void main(String[] args) {
		Account acc1 = new Account(); //Instantiating the class to create Account Object
		acc1.setAccountID(100);;
		acc1.setAccountName("Aasmi");
		acc1.setBalance(100);
		acc1.setAccountType("Savings");
	
		
//		Account acc2 = new Account();
//		acc2.accountID = 121;
//		acc2.accountName = "Srinivas";
//		acc2.balance = 120;
//		acc2.accountType = "Savings";
		
		acc1.displayAccountInfo();
//		acc2.displayAccountInfo();
		
		System.out.println("COUNTRY: " + Account.country);
		
		System.out.println("THE SUM IS : " + acc1.sum(2,4));
		
		System.out.println("THE SUM IS : " + acc1.sum(2,4,6));
		
		System.out.println("THE SUM IS : " + acc1.sum(2,4,6,8));
	}

}
