import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Curso c = new Curso(1, "Sistema de informacao");
    Disciplina d = new Disciplina("Dois", "Prog3", 5);

    System.out.println(c.apresenteSe());
    System.out.println();
    System.out.println(d.apresenteSe());

    c.setCodigo(3);
    System.out.println(c.getCodigo());

    c.setNome("Thomas Andrew");
    System.out.println(c.getNome());

    d.setCodigo("123");
    System.out.println(d.getCodigo());

    d.setNome("de Souza Batista");
    System.out.println(d.getNome());

    d.setNumCreditos(12);
    System.out.println(d.getNumCreditos());
  }
}
