package com.company;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Carpet animal = new Carpet("Animal", 1, 1, 5, 5);

        Car dog = new Car("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
    }
}
