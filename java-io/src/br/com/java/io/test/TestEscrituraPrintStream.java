package br.com.java.io.test;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestEscrituraPrintStream {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream printStream = new PrintStream("texto-print-stream.txt");
		printStream.println("Primera linea de texto ");
		printStream.println("Segunda linea de texto ");
		printStream.close();
	}
	
}
