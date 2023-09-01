/*Ler três números a partir do teclado e apresentá-los em ordem decrescente.*/

import java.util.Scanner;

public class Pt_two {

  private Scanner scan = new Scanner(System.in);
  private Pt_one pt_one;

  public Pt_two(Pt_one pt_one) {
    this.pt_one = pt_one;
  }

  public void decrescente() {
    if (pt_one.getA() > pt_one.getB() && pt_one.getA() > pt_one.getC()) {
      System.out.println(pt_one.getA() + "" + pt_one.getB() + "" + pt_one.getC());
    } else if (pt_one.getB() > pt_one.getA() && pt_one.getB() > pt_one.getC()) {
      System.out.println(pt_one.getB() + "" + pt_one.getC() + "" + pt_one.getA());
    } else if (pt_one.getC() > pt_one.getA() && pt_one.getC() > pt_one.getB()) {
      System.out.println(pt_one.getC() + "" + pt_one.getB() + "" + pt_one.getA());
    }
  }

  public Pt_one getPt_one() {
	  return pt_one;
  }

  public void setPt_one(Pt_one pt_one) {
	  this.pt_one = pt_one;
  }
}
