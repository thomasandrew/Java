/*Deseja-se calcular a conta de consumo de energia elétrica de um consumidor. Para isto, escreva um programa que leia o código do consumidor, o preço do KW e a quantidade de KW consumido, e exiba o código do consumidor e o total a pagar.
total a pagar = preço x quantidade total a pagar mínimo = R$ 21. 23*/

import java.util.Scanner;

public class Pt_two extends Pt_one {

  private double total;
  private Scanner scan = new Scanner(System.in); ;

  public Pt_two(double total) {
    super(0,0,0);
    this.total = total;
  }

  public void kw() {

    double cons = getCodConsumidor(), precoKW = getPreco_KW(), KWconsumido = getKW_Consumido();
    
    System.out.print("Digite o código do consumidor: ");
    cons = scan.nextDouble();

    System.out.println();

    System.out.println("Digite o preco do KW: ");
    precoKW = scan.nextDouble();

    System.out.println("Digite a quantidade do consumidor: ");
    KWconsumido = scan.nextDouble();

    this.total = precoKW * KWconsumido;

    System.out.println("O total é: " + this.total);
  }
  
}
