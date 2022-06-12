package com.alura.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Clase3 {
	public static void main(String[] args) {
		List<String> cursos = new ArrayList<>();
		cursos.add("Fisica");
		cursos.add("Java 8");
		cursos.add("Geometria del espacio");
		cursos.add("Historia universal");

		cursos.sort(new Comparar3());	//Ordena los elementos por longitud de la cadena de caracteres
		
		cursos.forEach(c -> System.out.println(c));
	}
}

class Comparar3 implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		//return o1.length() - o2.length();
		return Integer.compare(o1.length(), o2.length());
	}
	
	//Internamente compare() es utilizado por él método sort 
}


