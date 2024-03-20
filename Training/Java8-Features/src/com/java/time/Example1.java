package com.java.time;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Example1 {
	public static void main(String[] args) {
	   //Current date in "Asia/Kolkata"
        LocalDateTime todayKolkata = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Date in IST="+todayKolkata);
        
	   //Current date in "Australia/Sydney"
        LocalDateTime todayaus = LocalDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println("Current Date in Australia="+todayaus);       
        
 	   //Current date in "America/Los_Angeles"
        LocalDateTime todayla = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current Date in Los Angels="+todayla);             
	}
}
