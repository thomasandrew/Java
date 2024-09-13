public class Curso {
  private int codigo;
  private String nome;

  public Curso(int codigo, String nome) {
    super();
    this.codigo = codigo;
    this.nome = nome;
  }

  public String apresenteSe() {
    return "O codigo do curso e: " + this.codigo + "\nNome: "+ this.nome;
  }
}
