package model.dao;

import model.Empregado;

public class DaoEmpregado {
	//
	// CONSTANTES
	//
	final public static int NUM_MAX_ELEMENTOS = 10;
	//
	// ATRIBUTOS
	//
	private static int numElementos = 0;
	private static Empregado[] arrayDeElementos = new Empregado[NUM_MAX_ELEMENTOS];
	
	//
	// MÉTODOS
	// 
	public DaoEmpregado() {
		super();
	}
	
	/**
	 * Inclui um novo Empregado no array de elementos do Dao
	 */
	public boolean incluir(Empregado novo) {
		// Se o array de elementos já estiver completo, não podemos incluir ninguém
		if(DaoEmpregado.numElementos == DaoEmpregado.NUM_MAX_ELEMENTOS)
			return false;
		// Não podemos adicionar se o parâmetro recebido for nulo
		if(novo == null)
			return false;
		// Incluindo o novo Empregado no array de elementos do Dao
		DaoEmpregado.arrayDeElementos[ DaoEmpregado.numElementos ] = novo;
		// Incrementamos numElementos
		DaoEmpregado.numElementos++;
		// retornamos true informando que incluímos o novo Empregado
		return true;		
	}
	/**
	 * Retorna o Empregado cujo código foi passado por parâmetro. Caso não tenha, 
	 * retornamos null
	 */
	public Empregado obterEmpregadoPelaMatrFunc(int matrFunc) {
		// Para cada Empregado presente dentro do array de elementos
		for(int i = 0; i < DaoEmpregado.numElementos; i++) {
			int matrFuncDoEmpregado = DaoEmpregado.arrayDeElementos[i].getMatrFuncional();
			if(matrFuncDoEmpregado == matrFunc)
				return DaoEmpregado.arrayDeElementos[i];
		}
		return null;
	}
	/**
	 * Retorna o Empregado cujo nome foi passado por parâmetro. Caso não tenha, 
	 * retornamos null
	 */
	public Empregado obterEmpregadoPeloNome(String nome) {
		// Para cada Empregado presente dentro do array de elementos
		for(int i = 0; i < DaoEmpregado.numElementos; i++) {
			String nomeDoEmpregado = DaoEmpregado.arrayDeElementos[i].getNome();
			if(nomeDoEmpregado.equals(nome))
				return DaoEmpregado.arrayDeElementos[i];
		}
		return null;
	}
	
	/**
	 * Retorna todos os objetos Empregado gerenciados pelo DAO
	 */
	public static Empregado[] obterTodos() {
		return DaoEmpregado.arrayDeElementos;
	}
	
	static void recuperarTodos(Empregado[] array) {
		DaoEmpregado.arrayDeElementos = array;
		for (numElementos = 0; numElementos < array.length; numElementos++) {
			if (array[numElementos] == null) {
				break;
			}
		}
	}
}
