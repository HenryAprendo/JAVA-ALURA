package com.alura.java8;

import java.util.*;
import java.util.function.Function;

public class Clase5 {
	public static void main(String[] args) {
		List<String> cursos = new ArrayList<>();
		cursos.add("Fisica");
		cursos.add("Java 8");
		cursos.add("Geometria del espacio");
		cursos.add("Historia universal");
		
		//Una función que recibe un String y retorna un entero
		Function<String, Integer> funcion = x -> x.length();
		cursos.sort(Comparator.comparing(funcion));
		
		//segunda forma implementado la lambda directamente
		cursos.sort(Comparator.comparing(x -> x.length()));
		
		//Método reference es la forma:   String::length   .Significa recibe un String y devuelve el tamaño
		cursos.sort(Comparator.comparing(String::length));   
		cursos.forEach(curso -> System.out.println(curso));
		
		/**
		 * El símbolo para reference es :: y fuera de eso si se usa references ya no se puede usar lambda, uno sustituye al otro.
		 */
		
		
	}
}









