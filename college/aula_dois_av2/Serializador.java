package model.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Curso;
import model.Departamento;
import model.Empregado;

public class Serializador {
	public static void salvarObjetos() {
         try {		
		  FileOutputStream fos = new FileOutputStream("objetos.dat");
		  ObjectOutputStream oos = new ObjectOutputStream(fos);
		  
		  oos.writeObject(DaoAluno.obterTodos());
		  oos.writeObject(DaoCurso.obterTodos());
		  oos.writeObject(DaoDepartamento.obterTodos());
		  oos.writeObject(DaoEmpregado.obterTodos()); oos.close(); 
		  } catch (IOException e) { 
		   // TODO: handle exception 
			  JOptionPane.showMessageDialog(null, "Problema no salvamento dos objetos " + e.getMessage()); 
		  }
	}
	
	public static void recuperarObjetos() {
		try {
			FileInputStream fos = new FileInputStream("objetos.dat");
			ObjectInputStream oos = new ObjectInputStream(fos);
			DaoAluno.recuperarTodos((Aluno[])oos.readObject());
			DaoCurso.recuperarTodos((Curso[])oos.readObject());
			DaoDepartamento.recuperarTodos((Departamento[])oos.readObject());
			DaoEmpregado.recuperarTodos((Empregado[])oos.readObject());
			
			oos.close();
		} catch (IOException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Problema no salvamento dos objetos " + e.getMessage());
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Problema no salvamento dos objetos " + e.getMessage());
		}
	}
}
