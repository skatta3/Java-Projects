package com.java.time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeExample {
	 public static void main(String[] args) {

		  LocalDateTime currentDateTime = LocalDateTime.now();

		  System.out.println("India current DateTime : " + currentDateTime);

		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss");

		  ZonedDateTime zonedDateTime = currentDateTime.(ZoneId.of("Australia/Sydney"));

		  System.out.println("Aus Zoned time : " + zonedDateTime);

		  ZoneId zoneId = zonedDateTime.getZone();
		  System.out.println("zone id : " + zoneId);

//		  ZonedDateTime pstZoneTime = zonedDateTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
//		  System.out.println("PST time now : " + formatter.format(pstZoneTime));
		  
		  Instant instant = Instant.now();
		  
		  System.out.println(instant);
		  ZoneId zoneIdaus = ZoneId.of( "Australia/Sydney" );
		  ZonedDateTime zdt = instant.atZone( zoneIdaus );
		  
		  System.out.println(zdt);
		 }
}
