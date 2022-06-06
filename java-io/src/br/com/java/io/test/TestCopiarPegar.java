package br.com.java.io.test;
import java.io.*;
import java.net.Socket;

public class TestCopiarPegar {
	public static void main(String[] args) throws IOException {
		//InputStream fileInputStream = System.in;		//Lee desde la consola
		//OutputStream fileOutputStream = System.out;  //Escribe en consola
		
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
		
		/**
		 * 		
		Utilizando sockets para traer datos de la web, en este caso toca conectar el socket
		
		Socket socket = new Socket();
		Reader inputStreamReader2 = new InputStreamReader(socket.getInputStream());
		BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
		
		Socket socket2 = new Socket();
		Writer outputStreamWriter2 = new OutputStreamWriter(socket2.getOutputStream());
		BufferedWriter bufferedWriter2 = new BufferedWriter(outputStreamWriter2);
		 */
		
	}
}
