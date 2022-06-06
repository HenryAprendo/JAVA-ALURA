package br.com.java.io.test;
import java.io.*;

public class TestPrintWriter {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter printWriter = new PrintWriter("texto-print-writer.txt");
		printWriter.write("tercera forma de generar texto con PrintWriter");
		printWriter.println();
		printWriter.write("tercera forma de generar texto con PrintWriter");
		
		printWriter.close();
	}
}
