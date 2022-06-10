package br.com.alura;

import java.util.*;

public class Clase9 {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Historia", 30);
		Curso curso2 = new Curso("Algebra", 10);
		Curso curso3 = new Curso("Aritmetica", 20);
		Curso curso4 = new Curso("Geometria", 50);

		ArrayList<Curso> cursos = new ArrayList<>();

		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);

		int tiempo = 0;
		for (Curso curso : cursos) {
			tiempo += curso.getTiempo();
		}
		System.out.println("El tiempo total es: " + tiempo);

		// Con stream en una linea de codigo
		System.out.println("El tiempo total es: " + cursos.stream().mapToInt(Curso::getTiempo).sum());

		// Número mayor
		System.out.println(
				"El número mayor es: " + cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia"))
						.mapToInt(Curso::getTiempo).max().getAsInt());
		
		//Filtrando
		System.out.println(
				"El total es: " + cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia"))
						.mapToInt(Curso::getTiempo).sum());

	}

}









