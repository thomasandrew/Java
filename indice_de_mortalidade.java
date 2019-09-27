package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long quant,masculino=0,feminino=0,vintequatro_ou_menos=0;
        char sexo;

        System.out.println("Digite a quantidade de crianca: ");
        long num = scan.nextLong();

        for (int i=0; i<num; i++) {

            System.out.println("Digite o sexo: ");
            sexo = scan.next().charAt(0);

            System.out.println("Digite a quantidade de tempo que a crianca viveu: ");
            quant = scan.nextLong();

            if (sexo == 'm') {
                masculino++;
            }

            if (sexo == 'f') {
                feminino++;
            }

            if(quant <= 24) {
                vintequatro_ou_menos++;
            }
        }

        System.out.println("Quantidade de criancas mascuinas: "+masculino);
        System.out.println("Quantidade de criancas feminas: "+feminino);
        System.out.println("Quantidade de criancas de que viveram 24 meses e menos: "+vintequatro_ou_menos);

    }
}
