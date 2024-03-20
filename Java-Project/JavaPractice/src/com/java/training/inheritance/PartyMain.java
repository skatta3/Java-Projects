package com.java.training.inheritance;

import java.util.Scanner;

public class PartyMain {
	public static void main(String[] args) {
//		   int guests;
//		   Party aParty = new Party();
//		   Scanner keyboard = new Scanner(System.in);
//		   System.out.println("Enter number of guests for the party: ");
//		   guests = keyboard.nextInt();
//		   aParty.setGuests(guests);
//		   System.out.println("The party has " + aParty.getGuests() + " guests");
//		   aParty.displayInvitation();
		
		
		int guests;
		int choice;
		DinnerParty dParty = new DinnerParty();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number of guests for the party: ");
		guests = keyboard.nextInt();
		dParty.setGuests(guests);
		System.out.println("Enter the mentu option: 1 for chicken or 2 for beef: ");
		choice = keyboard.nextInt();
		dParty.setDinnerChoice(choice);
		dParty.displayInvitation();
		  }
	
}
