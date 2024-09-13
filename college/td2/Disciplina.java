public class Disciplina {
  private String codigo, nome;
  private int numCreditos;

  public Disciplina(String codigo, String nome, int numCreditos) {
    super();
    this.codigo = codigo;
    this.nome = nome;
    this.numCreditos = numCreditos;
  }

  public String apresenteSe() {
    return "O codigo e: " + this.codigo + "\nNome: " + this.nome + "\nNumero de credito: " + this.numCreditos;
  }
}
