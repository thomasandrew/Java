package com.company;

public class Main {

    private static final String INVALID_VALUE = "Invalid value";
    private static final String NUMBERS_ARE_EQUAL = "All numbers are equal";
    private static final String NUMBER_ARE_DIFFERENT = "All numbers are different";
    private static final String NEITHER = "Neither all are equal or different";

    public static void printEqual(int num1,int num2,int num3) {

           if(num1 < 0 || num2 < 0 || num3 < 0) {
               System.out.println("Invalid value");
           }  else if(num1 == num2 && num1 == num3 && num2 == num3) {
               System.out.println("All numbers are equal");
           }  else if(num1 != num2 && num1 != num3 && num2 != num3) {
               System.out.println("All numbers are different");
           } else {
               System.out.println("Neither all are equal or different");
           }
    }
}
