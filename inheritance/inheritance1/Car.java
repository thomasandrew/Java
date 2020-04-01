package com.company;

import java.awt.*;
import java.util.Scanner;

public class Car extends Carpet {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    /*public Car(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
    }*/

    public Car(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name,  1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
}
