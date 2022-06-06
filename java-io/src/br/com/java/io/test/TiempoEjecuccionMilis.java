package br.com.java.io.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TiempoEjecuccionMilis {
	public static void main(String[] args) throws IOException {
	    long ini = System.currentTimeMillis();

	    BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

	    bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
	    bw.newLine();
	    bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

	    bw.close();

	    long fin = System.currentTimeMillis();

	    System.out.println("Pasaron " + (fin - ini) + " milissegundos");
	}
}
