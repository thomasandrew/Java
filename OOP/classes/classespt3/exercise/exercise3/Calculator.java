package com.company;

public class Calculator {
    private Car floor;
    private Carpet carpet;

    public Calculator(Car floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return this.floor.getArea() * this.carpet.getCost();
    }
}
