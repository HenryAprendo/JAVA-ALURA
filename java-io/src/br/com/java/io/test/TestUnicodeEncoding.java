package br.com.java.io.test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TestUnicodeEncoding {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String letra = "A";
		System.out.println(letra.charAt(0) == 65);
		System.out.println("Codepoint: " + letra.codePointAt(0));
		
		//Podemos definir el tipo de encoding por default o lo definimos con forName():
		
		//Charset charset = Charset.defaultCharset();    
		Charset charset = Charset.forName("UTF-8");
		System.out.println("Charset: " + charset.displayName());
		
		//byte[] bytes = letra.getBytes("UTF-16");
		byte[] bytes = letra.getBytes(StandardCharsets.UTF_16);
		System.out.println("Cantidad de bytes: " + bytes.length);
		
		
		/**
		 * El codepoint es el número que representa un caracter en el código ascii.
		 * El charset es el encoding que convierte a binario el codepoint como UTF-8, UTF-16, windows-1252.
		 * Charset es la clase de java que nos permite trabajar con este tipo de información unicode
		 * La cantidad de bytes cambia de acuerdo al tipo de encoding que se utilize 
		 * UTF-8 1 byte y UTF-16 4 bytes
		 */
		
		//Generar un string apartir de un byte
		Charset utf8 = StandardCharsets.UTF_8;
		String s1 = "13º Órgão Oficial";
		byte[] bytes2 = s1.getBytes(utf8);
		String s2 = new String(bytes2, utf8);
		System.out.println(s2);
		
	}
}
