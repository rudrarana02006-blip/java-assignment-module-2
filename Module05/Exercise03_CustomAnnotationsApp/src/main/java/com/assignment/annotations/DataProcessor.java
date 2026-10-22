package com.assignment.annotations;

@Author(name = "Rudra Rana", version = "1.2.0")
public class DataProcessor {
    @TrackTime
    public void processData() {
        long sum = 0;
        for (int i = 0; i < 20_000_000; i++) {
            sum += i;
        }
        System.out.println("Processed dataset sum: " + sum);
    }
}
