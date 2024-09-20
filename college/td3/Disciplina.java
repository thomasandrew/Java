public class Disciplina {
  private String codigo, nome;
  private int numCreditos;

  public Disciplina(String codigo, String nome, int numCreditos) {
    super();
    this.codigo = codigo;
    this.nome = nome;
    this.numCreditos = numCreditos;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNumCreditos(int numCreditos) {
    this.numCreditos = numCreditos;
  }

  public int getNumCreditos() {
    return numCreditos;
  }
  
  public String apresenteSe() {
    return "O codigo e: " + this.codigo + "\nNome: " + this.nome + "\nNumero de credito: " + this.numCreditos;
  }
}
