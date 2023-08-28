/*Deseja-se calcular a conta de consumo de energia elétrica de um consumidor. Para isto, escreva um programa que leia o código do consumidor, o preço do KW e a quantidade de KW consumido, e exiba o código do consumidor e o total a pagar.
total a pagar = preço x quantidade total a pagar mínimo = R$ 21. 23*/

import java.util.Scanner;

public class Pt_one {

  private double codConsumidor;
  private double preco_KW;
  private double KW_Consumido;

  public Pt_one(double codConsumidor, double preco_KW, double KW_Consumido) {
    this.codConsumidor = codConsumidor;
    this.preco_KW = preco_KW;
    this.KW_Consumido= KW_Consumido;
  }

  public double getCodConsumidor() {
    return codConsumidor;
  }

  public void setCodConsumidor(double codConsumidor) {
    this.codConsumidor = codConsumidor;
  }

  public double getPreco_KW() {
    return preco_KW;
  }

  public void setPreco_KW(double preco_KW) {
    this.preco_KW = preco_KW;
  }

  public double getKW_Consumido() {
    return KW_Consumido;
  }

  public void setKW_Consumido(double KW_Consumido) {
    this.KW_Consumido = KW_Consumido;
  }
}
