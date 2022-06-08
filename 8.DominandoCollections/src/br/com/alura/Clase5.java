package br.com.alura;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Clase5 {
	public static void main(String[] args) {
		Curso curso1 = new Curso("PHP", 30);
		Curso curso2 = new Curso("JavaScript", 10);
		Curso curso3 = new Curso("Ruby", 20);
		Curso curso4 = new Curso("Java", 50);

		ArrayList<Curso> listaCursos = new ArrayList<>();

		listaCursos.add(curso1);
		listaCursos.add(curso2);
		listaCursos.add(curso3);
		listaCursos.add(curso4);

		/**
		 * Primera forma. Por default, al intentar imprimir nuestro lista de objetos lo
		 * que vemos en consola es una lista pero de las referencias en memoria de los
		 * objetos, mas no un valor legible. Es necesario hacer @override del método
		 * toString de la super clase Object, y hacer la implementación de lo que
		 * queremos devolver. En este caso, por ejemplo, devolvemos los nombres o los
		 * tiempos, o una combinación de ambos en un string concatenado.
		 */
		System.out.println(listaCursos);

		/**
		 * Por regla, para implementar el método Collections.sort, debo implementar la
		 * interface Comparable<T> y su método compareTo en la clase de la cual se están
		 * instanciando cada uno de los objetos de mi ArrayList, en este caso de Curso.
		 * Ya que internamente compareTo es implementado por el método sort.
		 */

		Collections.sort(listaCursos);
		// System.out.println(listaCursos);

		Collections.sort(listaCursos, Collections.reverseOrder());
		// System.out.println(listaCursos);

		/**
		 * Segunda forma: Ya no necesito implementar Comparable ni compareTo en mi clase
		 * Cursos.
		 */
		listaCursos.sort(Comparator.comparing(Curso::getNombre));
		System.out.println("Por nombre, en orden alfabetico: " + listaCursos);

		Collections.sort(listaCursos, Comparator.comparing(Curso::getTiempo)); // por tiempo que un numero
		System.out.println("Por tiempo(numero) " + listaCursos);

		Collections.sort(listaCursos, Comparator.comparing(Curso::getTiempo).reversed());
		System.out.println("Por tiempo invertido " + listaCursos);

		// Una nueva lista del tipo List
		List<Curso> nuevaLista = listaCursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby"))
				.sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
		System.out.println(nuevaLista);

	}
}
