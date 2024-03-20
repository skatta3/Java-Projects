package com.java.training.encapsulation;

public class NetBanking {

	public static void main(String[] args) {
		Bank user = new Bank();
		/** 
		 * Whenever Object has been created all Non static variables are copied in to memory
		 * 
		 */
		
		System.out.println("The Account Balance: " + user.bal);
		
		user.addr = "USA";
		
		System.out.println("The Address is :" + user.addr);
		
		/**
		 * When User is able to change the Address , User also can change Balance which is not 
		 * the case
		 */

	}

}
