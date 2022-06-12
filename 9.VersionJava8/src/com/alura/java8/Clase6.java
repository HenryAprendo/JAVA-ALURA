package com.alura.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Clase6 {
	public static void main(String[] args) {
		List<String> cursos = new ArrayList<>();
		cursos.add("Fisica");
		cursos.add("Java 8");
		cursos.add("Geometria del espacio");
		cursos.add("Historia universal");
		
		//Collections.sort(cursos, Comparator.comparing(String::length));
		cursos.sort(Comparator.comparing(String::length));					//orden menor a mayor
		cursos.sort(Comparator.comparing(String::length).reversed());		//orden mayor a menor
		
		
		cursos.forEach(System.out::println);
		
		cursos.forEach(x -> {
			System.out.println(x);
			System.out.println(x.length());
		});
		
	}
}
