package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Car mygradebook = new Car();

        System.out.println("Please enter the course name: ");
        String nameofcourse = input.nextLine();
        System.out.println();

        mygradebook.displayMessage(nameofcourse);

    }
}
