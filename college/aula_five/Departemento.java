package model;

public class Departamento {
	final public static int TAM_SIGLA = 2; 
	final public static int TAM_MIN_NOME = 5;
	final public static int TAM_MAX_NOME = 20;
	
	private String sigla;
	private String nome;
	
	public Departamento(String s, String n) throws modelException {
		super();
		this.setSigla(s);
		this.setNome(n);
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String s) throws modelException {
		Departamento.validarSigla(s);
		this.sigla = s;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String n) throws modelException {
		Departamento.validarNome(n);
		this.nome = n;
	}
	
	public static void validarSigla(String sigla) throws modelException {
		if (sigla == null || sigla.length() == 0) { 
			throw new modelException("A sigla do departamento não pode ser nula!");
		}
		
		if (sigla.length() != TAM_SIGLA) {
				throw new modelException("A sigla do departamento deve ter exatamente " + TAM_SIGLA + " caracteres");
		}
		
		for (int i = 0; i < sigla.length(); i++) {
			char c = sigla.charAt(i);
			if (!Character.isAlphabetic(c)) {
				throw new modelException("Na posição há um caracter invalido: " + c);
			}
		}
	}
	
	public static void validarNome(String nome) throws modelException {
		if (nome == null || nome.length() == 0) {
			throw new modelException("O nome do departamento não pode ser nulo!");
		}
		
		if (nome.length() < TAM_MIN_NOME || nome.length() > TAM_MAX_NOME) {
			throw new modelException("O nome do departamento deve ser entre " + TAM_MIN_NOME + " e " + TAM_MAX_NOME + " carateres");
		}
		
		for (int i = 0; i < nome.length(); i++) {
			char c = nome.charAt(i);
			if (!Character.isAlphabetic(c) && !Character.isSpaceChar(c)) {
				throw new modelException("O caracters deve ser alfabeticos");
			}
		}
	}
}
