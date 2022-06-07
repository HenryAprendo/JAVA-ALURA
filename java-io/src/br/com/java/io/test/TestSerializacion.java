package br.com.java.io.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializacion {
	

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//String dato = "Henry";
		//Cliente datoCliente = new Cliente("Henry", 123456);
		
		/**
		 * 	A es la creaci�n de un objeto a partir de un flujo binario de datos.
		 * La transformaci�n de una secuencia binaria en un objeto se denomina deserializaci�n.
		 * Output --> Guardamos el dato en el disco duro, haciendo una serializaci�n con ObjectOutputStream
		 */
		
		//ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("cliente.bin")); 
		//objectOutputStream.writeObject(datoCliente);
		//objectOutputStream.close();
		
		/**
		 * La transformaci�n del objeto en un flujo binario se llama serializaci�n.
		 * B es la transformaci�n de un objeto en un flujo binario.
		 */
		//input dato string
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String resultado = (String) objectInputStream.readObject();
		System.out.println(resultado);
		objectInputStream.close();
		
		//input dato cliente
		ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente resultado2 = (Cliente) objectInputStream2.readObject();
		System.out.println(resultado2.getDocumento());
		objectInputStream2.close();
	}
}
