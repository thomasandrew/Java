package model;

public class Curso {
	//
	// ATRIBUTOS
	//
	private int 	codigo;
	private String  nome;
	
	//
	// MÉTODOS
	//
	/**
	 * Método construtor de Curso
	 * @param c valor do código do curso
	 * @param n referência para a String com o nome do curso
	 */
	public Curso(int c, String n) {
		super();
		this.codigo = c;
		this.nome = n;
	}
	
	/**
	 * Método que retorna uma referência para a String que descreve o objeto Curso
	 */
	public String apresenteSe() {
		return "Sou um curso com código " + this.codigo + 
			   " e meu nome é " + this.nome;
	}
}
