package com.alura.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import model.Curso;

public class Clase9 {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Fisica", 200));
		cursos.add(new Curso("Java 8", 500));
		cursos.add(new Curso("Geometria del espacio", 400));
		cursos.add(new Curso("Historia universal", 300));
		
		cursos.sort(Comparator.comparing(Curso::getHoras));
		
		cursos.stream().filter(x -> x.getHoras() > 100).findFirst().ifPresent(System.out::println);
		
		Curso rta = cursos.stream().filter(x -> x.getHoras() > 600).findFirst().orElse(new Curso("NO EXISTE", 0));
		System.out.println(rta);
		
		
		List<Curso> listaFiltrada =	cursos.stream().filter(x -> x.getHoras() > 300).collect(Collectors.toList());
		listaFiltrada.forEach(System.out::println);
	}
}
