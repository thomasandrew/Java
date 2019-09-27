package com.company;

public class Main {

    public static void main(String[] args) {

        double chico = 1.50,ze = 1.10;
        int i;

        for (i=0; chico>ze; i++) {

            chico += 0.02;
            ze += 0.03;

        }

        System.out.println("chico: "+String.format("%.2f",chico));
        System.out.println("Ze: "+String.format("%.2f",ze));
        System.out.println("Quantidade de ano que chico vai ser maior que ze: "+i);

    }
}
