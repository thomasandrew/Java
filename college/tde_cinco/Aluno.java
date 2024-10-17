package model;

public class Aluno extends Pessoa {
	//
	// ATRIBUTOS - Só preciso acrescentar o que não foi HERDADO de Pessoa
	//
	private String matricula;

	//
	// MÉTODOS
	//
	/**
	 * Construtor de Aluno
	 * @param c
	 * @param n
	 * @param i
	 * @param m
	 * @throws ModelException
	 */
	public Aluno(String c, String n, int i, String m) throws ModelException {
		// Em todas as linguagens orientadas a objeto, a 1a instrução do construtor
		// de uma SUBCLASSE é chamar o construtor de sua SUPERCLASSE. Isso porque a
		// SUBCLASSE deve respeitar desde o início todas as regras de inicialização 
		// prescritas em sua SUPERCLASSE. Observe que se você retirar a instrução abaixo
		// o compilador acusará erro.
		super(c, n, i);
		// Determino a matrícula do aluno
		this.setMatricula(m);
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String m) throws ModelException {
		Aluno.validarMatricula(m);
		this.matricula = m;
	}

	public static void validarMatricula(String matricula) throws ModelException {
		// Verificando se o parâmetro corresponde a uma matrícula nulo ou vazio
		if (matricula == null || matricula.length() == 0)
			throw new ModelException("A matrícula do aluno não pode ser nula!");
		// Verificando o tamanho (em caracteres) da String
		if (matricula.length() != 10)
			throw new ModelException("A matrícula deve ter 10 dígitos!");
		// Verificando cada um dos caracteres presentes na String
		for (int i = 0; i < matricula.length(); i++) {
			// Recupero o caracter presente na posição 'i'
			char c = matricula.charAt(i);
			// Se o caracter NÃO é dígito lançamos exceção
			if (!Character.isDigit(c))
				throw new ModelException("O caracter na posição " + i + " não é um dígito: " + c);
		}
	}
}
