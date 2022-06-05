package br.com.java.io.test;
import java.io.*;

public class TestEscritura {
	public static void main(String[] args) throws IOException {
		//generamos el archivo
		OutputStream fileOutputStream = new FileOutputStream("texto-generado.txt");
		//procesamos el archivo
		Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		//escribimos el archivo
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		
		bufferedWriter.write("primera linea de mi archivo generado");
		bufferedWriter.newLine();
		bufferedWriter.write("segunda linea de mi archivo generado");
		bufferedWriter.newLine();
		bufferedWriter.write("tercera linea de mi archivo generado");
		bufferedWriter.newLine();
		
		bufferedWriter.close();
		
		
	}
}
