package com.java.training.accessmodifiers.p2;

import com.java.training.accessmodifiers.p1.Clock1;

public class ClockReader {
    Clock1 clock = new Clock1();

    public long readClock() {
        return clock.time;
    }
}