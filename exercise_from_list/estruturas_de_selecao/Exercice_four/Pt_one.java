/*4.
Entrar com nota da AV1 e nota da AV2 de um aluno. Imprima a média e uma das mensagens: "Aprovado", "Reprovado" ou "Fazer AV3".
Para aprovação a média deve ser acima de 6.0
Se a média for abaixo de 2.0 o aluno está automaticamente reprovado*/

import java.util.Scanner;

public class Pt_one {

  private double a, b;

  public Pt_one(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double getA() {
    return a;
  }

  public void setA(double a) {
    this.a = a;
  }

  public double getB() {
    return b;
  }

  public void setB(double b) {
    this.b = b;
  }
}
