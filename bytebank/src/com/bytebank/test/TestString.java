package com.bytebank.test;

public class TestString {
	public static void main(String[] args) {
		String nombre = "Alura";
		nombre = nombre.replace("A", "a");
		System.out.println(nombre);
		nombre = nombre.concat(" cursos online");
		System.out.println(nombre);
		nombre = nombre.toUpperCase();
		System.out.println("Convertido a mayusculas: " + nombre);
		nombre = nombre.toLowerCase();
		System.out.println("Convertido a minúsculas: " + nombre);
		char caracter = nombre.charAt(3);
		System.out.println("Caracter encontrado: " + caracter);
		int indice = nombre.indexOf("e");
		System.out.println("Indice encontrado: " + indice);
		
		String cualidad = "respetuoso";
		for (int i = 0; i < cualidad.length(); i++) {
			System.out.println(cualidad.charAt(i));
		}
		
		boolean longitudCero = cualidad.isEmpty();
		System.out.println("El string esta vacio falso o verdadero: " + longitudCero);
		
		System.out.println("Contiene la cadena de valores: " + cualidad.contains("petu"));
		
		
	}
}

/**
 * Un objeto String en java es inmutable, es decir, no se puede modificar su valor.
 * Lo que se hace es referenciar a través de una variable o reasignar la variable sobre la 
 * que se está trabajando, con el valor retornado por el método utilizado.
 */
