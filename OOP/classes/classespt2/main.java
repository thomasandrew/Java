package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car(); // porsche is an Object.
        Car holden = new Car();
        porsche.setModel("carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
