package com.company;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Car floor = new Car(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Car(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }
}
