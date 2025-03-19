package controller;

import java.util.Scanner;

import model.Departamento;
import model.modelException;
import viewer.JanelaDepartamento;
import viewer.JanelaPrincipal;

public class CtrlPrograma {
	public static void main(String[] args) {
		
		//Scanner teclado = new Scanner(System.in);
		
		//Departamento d1;
		
		//while(true) {
			//System.out.println("Entre com a sigla do departamento: ");
			//String sigla = teclado.nextLine();
			//System.out.println("Entre com o nome do departamento: ");
			//String nome = teclado.nextLine();
			//try {
				//d1 = new Departamento(sigla, nome);	
				//System.out.println(d1);
			//} catch (modelException e) {
				//System.out.println("Erro ao criar o objeto departamento " + e.getMessage());
				//return;
			//}
			
			//System.out.println("A sigla de d1 é: " + d1.getSigla());
			//System.out.println("O nome de d1 é: " + d1.getNome());
			
			//try {
			    //d1.setSigla("123");
				//d1.setNome("");
			//} catch (modelException e) {
				//System.out.println("Erro: " + e.getMessage());
				//return;
			//}
			
			//System.out.println("A sigla de d1 é: " + d1.getSigla());
			//System.out.println("O nome de d1 é: " + d1.getNome());
		
		//}
		JanelaPrincipal janela = new JanelaPrincipal();
		janela.setVisible(true);
	}
}
