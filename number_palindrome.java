package com.company;

public class Main {

    public static void main(String[] args) {

        boolean getre = isPalindrome(112212);
        System.out.println("Number reverse: "+getre);

    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int digit = 0;
        int ornumber = number;
        boolean revert;

        while (number != 0) {

            digit = number % 10;

            reverse = (reverse * 10) + digit;

            number /= 10;
        }

        return revert = ornumber == reverse ? true:false;
    }
}
