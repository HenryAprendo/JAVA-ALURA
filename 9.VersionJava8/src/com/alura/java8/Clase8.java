package com.alura.java8;

import java.util.*;

import model.Curso;

public class Clase8 {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Fisica", 200));
		cursos.add(new Curso("Java 8", 500));
		cursos.add(new Curso("Geometria del espacio", 400));
		cursos.add(new Curso("Historia universal", 300));
		
		cursos.sort(Comparator.comparing(Curso::getHoras));
		
		int suma = cursos.stream().mapToInt(x -> x.getHoras()).sum();
		System.out.println("La suma total de horas es " + suma );
		
		int suma2 = cursos.stream().filter(x -> x.getHoras() >= 300).mapToInt(x -> x.getHoras()).sum();
		System.out.println(suma2);
		
		int maximo = cursos.stream().mapToInt(x -> x.getHoras()).max().getAsInt();
		System.out.println("El número máximo: " + maximo);
		
		boolean validaTodo = cursos.stream().allMatch(x -> x.getHoras() > 200); //devuelve true si todos los elementos cumplen la condición
		System.out.println(validaTodo);
		
		
		Optional<Curso> optionalCurso = cursos.stream().filter(x -> x.getHoras() >= 300).findFirst();	//Retorna el primero que encuentre
		if (optionalCurso.isPresent()) {
			System.out.println(optionalCurso.get().getNombre());
		}
		
	}
}

















