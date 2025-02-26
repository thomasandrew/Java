package model;

public class Departamento {
	private String sigla;
	private String nome;
	
	public Departamento(String s, String n) {
		super();
		this.setSigla(s);
		this.setNome(n);
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String s) {
		this.sigla = s;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String n) {
		this.nome = n;
	}
	
	public boolean validarSigla(String sigla) {
		if (sigla == null || sigla.length() == 0) {
			return false;
		}
		
		for (int i = 0; i < sigla.length(); i++) {
			char c = sigla.charAt(i);
			if (!Character.isAlphabetic(c)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean validarNome(String Nome) {
		if (nome == null || nome.length() == 0) {
			return false;
		}
		
		for (int i = 0; i < nome.length(); i++) {
			char c = nome.charAt(i);
			if (!Character.isAlphabetic(c) && !Character.isSpaceChar(c)) {
				return false;
			}
		}
		return true;
	}
}
