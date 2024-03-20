package com.java.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeExample {
    public static void main(String[] args) {

        // Getting the curent LocalDate object.
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Present date : " + now);

        // getting year
        int year = now.getYear();

        // getting month
        Month month = now.getMonth();

        // getting day
        int day = now.getDayOfMonth();

        // getting hour
        int hour = now.getHour();

        // getting minutes
        int minute = now.getMinute();

        // getting second
        int second = now.getSecond();

        // printing all these three values.
        System.out.println("year : " + year + " , month : " + month + ", day : " + day + "Hour : " + hour
                + " , Minute : " + minute + ", Second : " + second);

        // creating the older date using of() method.
        LocalDateTime oldDate = LocalDateTime.of(1990, 12, 10, 10, 10, 10);
        System.out.println("Old date : " + oldDate);

        // Creating a new LocalDate instance using toLocalDate() method.
        LocalDate newlocalDate = now.toLocalDate();
        System.out.println("newlocalDate : " + newlocalDate);

        // Creating a new LocalTime instance using toLocalDate() method.
        LocalTime newlocalTime = now.toLocalTime();
        System.out.println("newlocalTime : " + newlocalTime);

        // Date parsing from string to date
        LocalDateTime strToDate = LocalDateTime.parse("2019-10-10T10:10:10");
        System.out.println("String to Date : " + strToDate);

    }
}
