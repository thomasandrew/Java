package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long num,maior=0L;
        char perg;

        do {

            System.out.println("Digite o numero: ");
            num = scan.nextLong();

            if (num > maior) {
                maior = num;

            }

            System.out.println("Digite N se voce quer sair: ");
            perg = scan.next().charAt(0);

        } while(perg != 'N');

        System.out.println("O maior numero e: "+maior);

    }
}
