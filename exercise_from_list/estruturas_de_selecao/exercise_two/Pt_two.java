//Escreva um programa para ler três números inteiros distintos e determinar o menor deles.

import java.util.Scanner;

public class Pt_two extends Pt_one {

  public Pt_two() {
    super(1,2,3);
  }
  public void inteiro() {
    if (getNumeroInteiro() < getNumber_two() && getNumeroInteiro() < getNumberThree()) {
      System.out.println("numeroInteiro é menor " + getNumeroInteiro());
    } else if (getNumber_two() < getNumeroInteiro() && getNumber_two() < getNumberThree()) {
      System.out.println("Number_two é menor " + getNumber_two());
    } else if (getNumberThree() < getNumeroInteiro() && getNumberThree() < getNumber_two()) {
      System.out.println("NumberThree é menor ");
    }
  }
}
