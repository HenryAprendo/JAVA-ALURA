package com.alura.java8;
import model.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Clase7 {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Fisica", 200));
		cursos.add(new Curso("Java 8", 500));
		cursos.add(new Curso("Geometria del espacio", 400));
		cursos.add(new Curso("Historia universal", 300));
		
		cursos.sort(Comparator.comparing(Curso::getHoras));
		
		cursos.forEach(curso -> System.out.println(curso.getHoras()));
		
		cursos.stream().filter(x -> x.getHoras() >= 300).forEach(item -> System.out.println(item.getNombre()));
		
	}
}





















