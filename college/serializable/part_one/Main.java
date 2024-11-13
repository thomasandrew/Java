package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import model.One;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//One one = new One("Camiseta", 20d);
		/* System.out.println(one); */
		
		/* ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream("one.byte"));
		objectOutput.writeObject(one);
		objectOutput.close();
		System.out.println("Writing file to: " + new java.io.File("one.byte").getAbsolutePath()); */
		
		ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("one.byte"));
		One one = (One) objectInput.readObject();
		objectInput.close();
		System.out.println(one.getName());
	}
}
