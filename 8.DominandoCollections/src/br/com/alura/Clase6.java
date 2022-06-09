package br.com.alura;
import java.util.*;

import model.Aula;
import model.Curso;


public class Clase6 {

	public static void main(String[] args) {
		Curso curso1 = new Curso("Java", 30);
		curso1.addAula(new Aula("Polimorfismo"));
		curso1.addAula(new Aula("Herencia"));
		curso1.addAula(new Aula("Interfaces"));

		ArrayList<Curso> cursos = new ArrayList<Curso>();
		cursos.add(curso1);
		
		System.out.println(cursos.get(0).getClaseList());
		
		System.out.println(cursos);
		
	}
	
	
}
