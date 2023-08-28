/*Deseja-se calcular a conta de consumo de energia elétrica de um consumidor. Para isto, escreva um programa que leia o código do consumidor, o preço do KW e a quantidade de KW consumido, e exiba o código do consumidor e o total a pagar.
total a pagar = preço x quantidade total a pagar mínimo = R$ 21. 23*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Pt_two pt_two = new Pt_two(0);
    pt_two.kw();
  }
}
