package com.alura.java8;
import java.util.*;

public class Clase1 {
	public static void main(String[] args) {
		List<String> cursos = new ArrayList<>();
		cursos.add("Fisica");
		cursos.add("Java 8");
		cursos.add("Geometria del espacio");
		cursos.add("Historia universal");
		
		System.out.println(cursos);
		
		Collections.sort(cursos, new Comparar());
		
		for (String curso: cursos) {
			System.out.println(curso);
		}
		
	}
}

class Comparar implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		//return o1.length() - o2.length();
		return Integer.compare(o1.length(), o2.length());
	}
	
	//Internamente compare() es utilizado por él método sort 
}





