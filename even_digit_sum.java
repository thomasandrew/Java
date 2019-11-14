package com.company;

public class Main {

    public static void main(String[] args) {
         int sum = getEvenDigitSum(123456789);
         System.out.println(sum);
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;

        if (number < 0) {
            return -1;
        }

        //while ((number % 10) > 0) { Pode ser assim ou pode ser que nem abaixo.
        while (number > 0) {
             if ((number % 10) % 2 == 0) {
                   sum += number % 10;
             }
            number/= 10;
        }

        return sum;
    }
}
