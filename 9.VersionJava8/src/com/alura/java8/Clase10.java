package com.alura.java8;

import model.CursoTipo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Curso;

public class Clase10 {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Fisica", 200));
		cursos.add(new Curso("Java 8", 500));
		cursos.add(new Curso("Geometria del espacio", 400));
		cursos.add(new Curso("Historia universal", 300));

		List<CursoTipo> cursoTipo = new ArrayList<>();
		cursoTipo.add(new CursoTipo("Fisica", 200, 1));
		cursoTipo.add(new CursoTipo("Java 8", 500, 2));
		cursoTipo.add(new CursoTipo("Geometria del espacio", 400, 3));
		cursoTipo.add(new CursoTipo("Historia universal", 300, 4));

		cursos.sort(Comparator.comparing(Curso::getHoras));

		Map<Integer, String> mapaCurso = cursos.stream().filter(x -> x.getHoras() >= 300)
				.collect(Collectors.toMap(Curso::getHoras, Curso::getNombre));

		mapaCurso.forEach((clave, valor) -> {
			System.out.println(clave + " - " + valor);
		});

		Map<Integer, List<CursoTipo>> mapaCursoTipo = cursoTipo.stream().filter(x -> x.getHoras() > 300)
				.collect(Collectors.groupingBy(CursoTipo::getTipo));
		
		mapaCursoTipo.forEach((clave, valor) -> {
			System.out.println(valor);
		});

	}
}




