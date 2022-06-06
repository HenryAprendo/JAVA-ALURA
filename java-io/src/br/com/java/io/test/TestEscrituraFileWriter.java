package br.com.java.io.test;

import java.io.*;

public class TestEscrituraFileWriter {
	public static void main(String[] args) throws IOException {
		
		FileWriter fileWriter = new FileWriter("texto-file-writer.txt");
		fileWriter.write("Primera linea de texto-file-writer");
		fileWriter.write(System.lineSeparator());
		fileWriter.write("Segunda linea de texto-file-writer");
		fileWriter.write(System.lineSeparator());
		fileWriter.write("Tercera linea de texto-file-writer");
		
		fileWriter.close();
		
	}
}
