/*4.
Entrar com nota da AV1 e nota da AV2 de um aluno. Imprima a média e uma das mensagens: "Aprovado", "Reprovado" ou "Fazer AV3".
Para aprovação a média deve ser acima de 6.0
Se a média for abaixo de 2.0 o aluno está automaticamente reprovado*/

import java.util.Scanner;

public class Pt_two {

  private Scanner scan = new Scanner(System.in);
  private Pt_one pt_one;
  private double media;
  private double total;

  public Pt_two(Pt_one pt_one, double media, double total) {
    this.pt_one = pt_one;
    this.media = media;
    this.total = total;
  }

  public void mediaDoAluno() {
    System.out.println("AV 1: " + pt_one.getA() + "\n");
    System.out.println("AV 2: " + pt_one.getB() + "\n");

    this.total = pt_one.getA() + pt_one.getB();
    this.media = this.total / 2;

    if (this.media > 6.0) {
      System.out.println(this.media + "\nAprovado");
    } else if (this.media <= 6.0) {
      System.out.println(this.media + "\nFazer AV 3");
    } else if (this.media < 2.0) {
      System.out.println(this.media + "\nReprovado");
    }
  }

  public Pt_one getPt_one() {
	  return pt_one;
  }

  public void setPt_one(Pt_one pt_one) {
	  this.pt_one = pt_one;
  }
}
