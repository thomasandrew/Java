/*Ler três números a partir do teclado e apresentá-los em ordem decrescente.*/

import java.util.Scanner;

public class Pt_one {

  private int a, b, c;

  public Pt_one(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  public int getC() {
    return c;
  }

  public void setC(int c) {
    this.c = c;
  }
}
