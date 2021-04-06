package com.info.jjd.exam;

import java.time.LocalTime;

public class Customer {
    private final LocalTime currentTime;

    public Customer(int hour, int min) {
        this.currentTime = LocalTime.of(hour, min);
    }

    public LocalTime getCurrentTime() {
        return currentTime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "currentTime=" + currentTime +
                '}';
    }
}
