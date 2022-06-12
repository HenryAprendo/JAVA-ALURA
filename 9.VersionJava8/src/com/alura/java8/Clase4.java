package com.alura.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Clase4 {
	public static void main(String[] args) {
		List<String> cursos = new ArrayList<>();
		cursos.add("Fisica");
		cursos.add("Java 8");
		cursos.add("Geometria del espacio");
		cursos.add("Historia universal");

		//cursos.sort(new Comparator<String>() {
			//@Override
			//public int compare(String o1, String o2) {
				//return Integer.compare(o1.length(), o2.length());
			//}
		//});
		
		//lambdas
		cursos.sort((o1, o2) -> {
			return Integer.compare(o1.length(), o2.length());
		});
		
		cursos.forEach(c -> System.out.println(c));		//interface funcional
	}
}

/**
 * A diferencia de clases anteriores en sort ya no es necesario, implementar una clase anonima de Comparator o una clase que implemente 
 * esta interface, pues en java 8 (1.8) se implementaron las clases funcionales que reducen el código por el uso de los lamdas y que hacen 
 * el resto por debajo.
 * Lo mismo para forEach, ya no pasamos la clase anonima de Consumer con su metodo accept, sino por medio de un lambda implementamos compare
 * , y el resto lo hace java por debajo. Dejando un código mas limpio.
 */











