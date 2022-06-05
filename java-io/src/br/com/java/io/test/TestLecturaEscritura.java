package br.com.java.io.test;

import java.io.*;

public class TestLecturaEscritura {
	
	public static void main(String[] args) throws IOException {
		//Lectura de archivos
		InputStream fileInputStream = new FileInputStream("texto-generado.txt");
		Reader inputStreamReader = new InputStreamReader(fileInputStream); 
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		String linea;
		
		while( (linea = bufferedReader.readLine()) != null ) {
			System.out.println(linea);
		}
		
		
		//escritura y generación de archivos
		OutputStream fileOutputStream = new FileOutputStream("texto-practica.txt");
		Writer outputStreamWrite = new OutputStreamWriter(fileOutputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWrite);
		
		bufferedWriter.write("primera practica de conceptos");
		bufferedWriter.newLine();
		
		bufferedWriter.close();   //Genera finalmente el archivo 
		
		//En la carpeta principal hacer refresh para que aparezca el archivo generado
		
		
	}
	
}
