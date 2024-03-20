package com.java.time;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
    public static void main(String[] args) {

        // Getting the current LocalDate object.
        LocalDate now = LocalDate.now();
        System.out.println("Present date : " + now);

        // getting year
        int year = now.getYear();

        // getting month
        Month month = now.getMonth();

        // getting day
        int day = now.getDayOfMonth();

        // printing all these three values.
        System.out.println("year : " + year + " , month : " + month + ", day : " + day);

        // getting month in int value
        int monthInt = now.getMonthValue();

        // printing in format YYYY-MM-DD
        System.out.println("today date : " + year + "-" + monthInt + "-" + day);

        LocalDate oldDate = LocalDate.of(2015, 2, 2);
        System.out.println("Old date : " + oldDate);
        
        

    }
}
