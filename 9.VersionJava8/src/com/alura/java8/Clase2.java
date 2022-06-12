package com.alura.java8;

import java.util.*;
import java.util.function.Consumer;

public class Clase2 {
	public static void main(String[] args) {
		List<String> cursos = new ArrayList<>();
		cursos.add("Fisica");
		cursos.add("Java 8");
		cursos.add("Geometria del espacio");
		cursos.add("Historia universal");

		cursos.sort(new Comparar2());	//Ordena los elementos por longitud de la cadena de caracteres
		
		cursos.forEach(new Consumer<String>() {		//Implementado una clase anonima en el foreach
			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		});
			
	}
}


class Comparar2 implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		//return o1.length() - o2.length();
		return Integer.compare(o1.length(), o2.length());
	}
	
	//Internamente compare() es utilizado por él método sort 
}



