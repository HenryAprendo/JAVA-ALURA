package br.com.alura;

import java.util.*;

import model.Aula;
import model.Curso;

public class Clase7 {

	public static void main(String[] args) {
		Curso curso1 = new Curso("Java", 30);
		curso1.addAula(new Aula("Polimorfismo"));
		curso1.addAula(new Aula("Herencia"));
		curso1.addAula(new Aula("Interfaces"));
		curso1.addAula(new Aula("In"));
		
		List<Aula> listAula = curso1.getClaseList();
		System.out.println(listAula);

		ArrayList<Curso> cursos = new ArrayList<Curso>();
		cursos.add(curso1);
		
		System.out.println(cursos.get(0).getClaseList());
	}
}


/***
 * El concepto de lista inmutable es aplicado en este caso y nos ayuda a garantizar la no modificación de una lista solo desde la clase
 * a que pertenece y apartir de sus métodos.
 * listAula recibe la lista de las aulas de curso1, si intentaramos hacer listAula.add(new Aula("inmutable")) no se podria hacer, porque 
 * desde la clase Curso implementamos encapsulamiento con  Collections.unmodifiableList( this.claseList);
 * De esta forma tendremos nuestra lista inmutable y encapsulada. 
 */












