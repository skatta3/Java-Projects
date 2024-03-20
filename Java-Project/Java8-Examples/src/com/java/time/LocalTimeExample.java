package com.java.time;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {

        // Getting the curent LocalDate object.
        LocalTime now = LocalTime.now();
        System.out.println("Present time : " + now);

        // getting hour
        int hour = now.getHour();

        // getting minutes
        int minute = now.getMinute();

        // getting second
        int second = now.getSecond();

        // printing all these three values.
        System.out.println("Hour : " + hour + " , Minute : " + minute + ", Second : " + second);

        // getting nano seconds
        int nanoSec = now.getNano();

        // printing in format HH:24MM:ss:SSS
        System.out.println("time now in format : " + hour + ":" + minute + ":0" + second + ":" + nanoSec);

        LocalTime oldTime = LocalTime.of(13, 20, 25);
        System.out.println("Old time : " + oldTime);

    }
}
