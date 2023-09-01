/*Ler três números a partir do teclado e apresentá-los em ordem decrescente.*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Pt_two pt_two = new Pt_two(new Pt_one(3, 1, 2));
    pt_two.decrescente();
  }
}
