package model;

public class Aluno extends Pessoa{
	private String matricula;
	
	public Aluno(String matricula, String cpf, String nome, int idade) throws Exception {
		super(cpf, nome, idade);
		this.setMatricula(matricula);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public static void validaMatricula(String matricula) {
		if (matricula == null || matricula.length() == 0) {
			throw new ModelException("O nome aluno não pode ser nula")
		}
	}
}
