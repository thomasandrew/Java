package com.company;

public class Main {

    public static void printDayOfTheWeek(int day) {

        switch(day) {

            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thurs   day");
                break;

            case 6:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
