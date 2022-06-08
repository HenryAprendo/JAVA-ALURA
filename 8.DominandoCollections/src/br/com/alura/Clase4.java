package br.com.alura;
import java.util.*;

public class Clase4 {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Geometria", 30);
		Curso curso2 = new Curso("Fisica", 10);
		Curso curso3 = new Curso("Quimica", 20);
		Curso curso4 = new Curso("Historia", 50);
		
		ArrayList<Curso> listaCursos = new ArrayList<>();
		
		listaCursos.add(curso1);
		listaCursos.add(curso2);
		listaCursos.add(curso3);
		listaCursos.add(curso4);
		
		System.out.println(listaCursos);
		
		for (int i = 0; i < listaCursos.size(); i++) {
			System.out.println(listaCursos.get(i));
		}
	}
}
