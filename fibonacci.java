package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = 0, b = 1, aux;

        for (int i = 0; i < 30; i++) {
            System.out.println(a);
            aux = a;
            a = a + b;
            b = aux;
        }
    }
}
