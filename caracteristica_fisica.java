package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char sex,olhos,cabelos;
        long maior = 0,idade,mulheres=0,homens=0;

        for (int i=0; i<2; i++) {
            System.out.println("Digite o seu sexo: ");
            sex = scan.next().charAt(0);

            System.out.println("Digite a cor do seus olhos: ");
            olhos = scan.next().charAt(0);

            System.out.println("Digite a cor do seu cabelo: ");
            cabelos = scan.next().charAt(0);

            System.out.println("Digite a sua idade: ");
            idade = scan.nextLong();

            if(idade > maior) {
                maior = idade;
            }

            if(sex == 'f' &&  idade>=18 && idade <= 35 && olhos == 'v' && cabelos == 'l') {
                 mulheres++;
            }

            if(sex == 'm' && idade < 18) {
                homens++;
            }

        }

        System.out.println("A maior idade dos habitantes: "+maior);
        System.out.println("A porcentagem do sexo feminino cuja a idade esta entre 18 e 35 anos inclusive e que tenham olhos verdes e cabelos loiros: "+mulheres);
        System.out.println("A quantidade de individos do sexo masculino cuja a idade seja menor que 18: "+homens);

    }
}
