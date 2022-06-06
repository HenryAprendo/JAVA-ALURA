package br.com.java.io.test;

import java.io.*;
import java.util.*;

public class TestLecturaCsv {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("archivo.csv"));
		String linea;
		
		while( scanner.hasNextLine() && (linea = scanner.nextLine()) != null ) {
			//System.out.println(linea);
			
			//Usando split para separar mis valores de la cadena en cada linea
			String[] lineas = linea.split(",");
			System.out.println("Split: " + Arrays.toString(lineas));
			System.out.println(lineas[0]);
			
			//Usando format
			System.out.println("Format: " + String.format("%s, %s", lineas));
			
			//Usando Scanner
			Scanner lineaScanner = new Scanner(linea);
			lineaScanner.useDelimiter(",");
			String valor;
			
			while(lineaScanner.hasNextLine() && (valor = lineaScanner.nextLine()) != null) {
				System.out.println("Scanner: " + valor);
			}
			
			
			
		}
	}
}









