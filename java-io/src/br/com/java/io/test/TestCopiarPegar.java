package br.com.java.io.test;
import java.io.*;

public class TestCopiarPegar {
	public static void main(String[] args) throws IOException {
		//InputStream fileInputStream = System.in;
		InputStream fileInputStream = new FileInputStream("texto.txt");
		Reader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		OutputStream fileOutputStream = new FileOutputStream("copia-texto.txt");
		Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
		
		String linea;
		
		while( (linea = bufferedReader.readLine()) != null) {
			bufferedWriter.write(linea);
			bufferedWriter.newLine();
		}
		
		bufferedReader.close();
		bufferedWriter.close();
	}
}
