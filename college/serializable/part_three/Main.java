package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import model.One;
import model.Three;
import model.Two;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*Two two = new Two("Camiseta", 20d);
		Three three = new Three(two, 10d); 
		
		ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream("three.byte"));
		objectOutput.writeObject(three);
		objectOutput.close();
		
		System.out.println("Writing file to: " + new java.io.File("three.byte").getAbsolutePath()); */
		
	    ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("three.byte"));
		Three three = (Three) objectInput.readObject();
		objectInput.close();
		System.out.println(three.getTotal());
		System.out.println(three.getProduct());
	}
}
