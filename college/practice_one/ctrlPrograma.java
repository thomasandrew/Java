package controller;

import model.Departamento;
import model.ModelException;
import view.JanelaDepartamento;

public class CrtrPrograma {
	public static void main(String[] args) throws ModelException {
		Departamento d1 = new Departamento("CB", "consomething");
		System.out.println(d1.getNome());
		
		d1.setSigla("1");
		System.out.println(d1.validarSigla(d1.getSigla()));
		
		d1.setNome("Thomas");
		System.out.println(d1.validarNome(d1.getNome()));
		
		JanelaDepartamento jd = new JanelaDepartamento();
	}
}
