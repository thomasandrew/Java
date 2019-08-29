package com.company;

public class Main {

    //psvm abreviação para public static void main(String[] args) {}

    //public static void main(String[] args) {
    //     toMilesPerHour(5);
    //}

    public static long toMilesPerHour(double KilometersPerHour) {

         if(KilometersPerHour < 0) {
             return -1;
         }

         return Math.round(KilometersPerHour / 1.609);
    }
    public static void printConversion(double KilometersPerHour) {

        if(KilometersPerHour < 0) {
            System.out.println("Invalid value");
        } else {
            long milesPerHour =  toMilesPerHour(KilometersPerHour);
            System.out.println(KilometersPerHour + " Km/h = " + milesPerHour + " mi/h");
        }


    }
}
