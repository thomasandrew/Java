package model.dao;

import model.Departamento;
import model.Empregado;

public class DaoDepartamento {
	//
	// CONSTANTES
	//
	final public static int NUM_MAX_ELEMENTOS = 10;
	//
	// ATRIBUTOS
	//
	private static int numElementos = 0;
	private static Departamento[] arrayDeElementos = new Departamento[NUM_MAX_ELEMENTOS];
	
	//
	// MÉTODOS
	// 
	public DaoDepartamento() {
		super();
	}
	
	/**
	 * Inclui um novo Departamento no array de elementos do Dao
	 */
	public boolean incluir(Departamento novo) {
		// Se o array de elementos já estiver completo, não podemos incluir ninguém
		if(DaoDepartamento.numElementos == DaoDepartamento.NUM_MAX_ELEMENTOS)
			return false;
		// Não podemos adicionar se o parâmetro recebido for nulo
		if(novo == null)
			return false;
		// Incluindo o novo Departamento no array de elementos do Dao
		DaoDepartamento.arrayDeElementos[ DaoDepartamento.numElementos ] = novo;
		// Incrementamos numElementos
		DaoDepartamento.numElementos++;
		// retornamos true informando que incluímos o novo Departamento
		return true;		
	}
	/**
	 * Retorna o Departamento cujo código foi passado por parâmetro. Caso não tenha, 
	 * retornamos null
	 */
	public Departamento obterDepartamentoPelaSigla(String sigla) {
		// Para cada Departamento presente dentro do array de elementos
		for(int i = 0; i < DaoDepartamento.numElementos; i++) {
			String siglaDoDepartamento = DaoDepartamento.arrayDeElementos[i].getSigla();
			if(siglaDoDepartamento.equals(sigla))
				return DaoDepartamento.arrayDeElementos[i];
		}
		return null;
	}
	/**
	 * Retorna o Departamento cujo nome foi passado por parâmetro. Caso não tenha, 
	 * retornamos null
	 */
	public Departamento obterDepartamentoPeloNome(String nome) {
		// Para cada Departamento presente dentro do array de elementos
		for(int i = 0; i < DaoDepartamento.numElementos; i++) {
			String nomeDoDepartamento = DaoDepartamento.arrayDeElementos[i].getNome();
			if(nomeDoDepartamento.equals(nome))
				return DaoDepartamento.arrayDeElementos[i];
		}
		return null;
	}
	
	/**
	 * Retorna todos os objetos Departamento gerenciados pelo DAO
	 */
	public static Departamento[] obterTodos() {
		return DaoDepartamento.arrayDeElementos;
	}
	
	static void recuperarTodos(Departamento[] array) {
		DaoDepartamento.arrayDeElementos = array;
		for (numElementos = 0; numElementos < array.length; numElementos++) {
			if (array[numElementos] == null) {
				break;
			}
		}
	}
}
