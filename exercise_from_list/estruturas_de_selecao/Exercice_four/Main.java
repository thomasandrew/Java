/*4.
Entrar com nota da AV1 e nota da AV2 de um aluno. Imprima a média e uma das mensagens: "Aprovado", "Reprovado" ou "Fazer AV3".
Para aprovação a média deve ser acima de 6.0
Se a média for abaixo de 2.0 o aluno está automaticamente reprovado.*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Pt_two pt_two = new Pt_two(new Pt_one(5.0, 3.0), 0.0, 0.0);
    pt_two.mediaDoAluno();
  }
}
