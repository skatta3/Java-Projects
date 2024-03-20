package com.java.staticimport;

import static java.util.Date;

import static java.lang.System.*;

public class DisplayDate {
	public static void main(String[] args) {
		Date date = new Date();
		out.println("Today's date is : " + date);
	}
}
