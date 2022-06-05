package br.com.java.io.test;

import java.io.*;

public class TestLectura {
	public static void main(String[] args) throws IOException  {
		
		//Obtenemos el archivo
		FileInputStream fileInputString = new FileInputStream("texto.txt");
		//Procesamos el archivo
		Reader inputStreamReader = new InputStreamReader(fileInputString);
		//Leemos el archivo
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		String linea;
		
		while( (linea = bufferedReader.readLine()) != null ) {
			System.out.println(linea);
		}
		
		bufferedReader.close();
		
	}
}


