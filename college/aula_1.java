package controller;

import java.util.Scanner;

public class CtrlPrograma {
	
	public static int contaVogais(String texto) {
		int contador = 0;
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (c == 'a' || c == 'e' || c =='i' || c == 'o' || c =='u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c =='U') {
				contador++;
			}
		}
		return contador;
	}

	public static void main(String[] args) {
//		System.out.println("Olá, mundo!");
//		int thomas = 10;
//		thomas *= 2;
//		System.out.println(thomas);
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i + "é um número par");
//			} else {
//				System.out.println(i + "é um numero impar");
//			}
//		}
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Entre com o valor: ");
//		int valor = scan.nextInt();
//		if (valor % 2 == 0) {
//			System.out.println(valor + " é um número par");
//		} else {
//			System.out.println(valor + " é um numero impar");
//		}
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Entre com o valor: ");
//		int valor = scan.nextInt();
//		if (ehPar(valor)) {
//			System.out.println(valor + " é um número par");
//		} else {
//			System.out.println(valor + " é um numero impar");
//		}
		
		Scanner scan = new Scanner(System.in);
		String frase = scan.nextLine();
		System.out.println("O texto possui " + contaVogais(frase) + " Vogais!");
	}
}
