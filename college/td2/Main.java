import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Curso c = new Curso(1, "Sistema de informacao");
    Disciplina d = new Disciplina("Dois", "Prog3", 5);

    System.out.println(c.apresenteSe());
    System.out.println();
    System.out.println(d.apresenteSe());
  }
}
