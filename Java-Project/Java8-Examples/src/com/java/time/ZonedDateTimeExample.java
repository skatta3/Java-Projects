package com.java.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeExample {
	 public static void main(String[] args) {
		 String pattern  = "yyyy-MM-dd HH:mm:ss";
		  LocalDateTime currentDateTime = LocalDateTime.now(ZoneOffset.UTC);;

		  System.out.println("India current DateTime : " + currentDateTime);

		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss");

		  ZonedDateTime zonedDateTime = currentDateTime.atZone(ZoneId.of("America/Los_Angeles"));

		  System.out.println("Aus Zoned time : " + formatter.format(zonedDateTime));

		  ZoneId zoneId = zonedDateTime.getZone();
		  System.out.println("zone id : " + zoneId);

		  ZonedDateTime pstZoneTime = zonedDateTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
		  
		  ZonedDateTime zdt = ZonedDateTime.ofInstant(currentDateTime, ZoneOffset.UTC, ZoneId.of("America/Los_Angeles"));

		    String timeStr = zdt.format(DateTimeFormatter.ofPattern(pattern));
		  System.out.println("PST time now : " + timeStr);
		 }
}
