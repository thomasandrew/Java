package com.company;

public class Main {

    public static void main(String[] args) {

        int digit = sumFirstAndLastDigit(-10);
        System.out.println(digit);
    }

    public static int sumFirstAndLastDigit(int number) {

        int firstdigit = 0;
        int lastdigit = number % 10;

        if (number < 0) {
            return -1;
        }

        while (number > 0) {
            firstdigit = number % 10;
            number /= 10;
        }

        return firstdigit + lastdigit;
    }
}
