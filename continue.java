package com.company;

public class Main {

    public static void main(String[] args) {
        long number = 0L;

        while (number < 15) {
            number++;
            if (number <= 5) {
                System.out.println("Skipping numbers: "+number);
                continue;//Will bypass.
            }

            System.out.println("Number= "+number);

            if (number >= 10) {
                System.out.println("Breaking at "+number);
                break;
            }
        }

    }
}
