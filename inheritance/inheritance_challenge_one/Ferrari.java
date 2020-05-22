package com.company;

public class Ferrari extends Car {
    private int roadServiceMonths;

    public Ferrari(int roadServiceMonths) {
        super("Ferrari", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
