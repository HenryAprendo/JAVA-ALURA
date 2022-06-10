package br.com.alura;
import java.util.*;

import model.Alumno;
import model.Curso;

public class Clase16 {
	public static void main(String[] args) {
	Curso curso1 = new Curso("Mecanica", 30);
		
		Alumno alumno1 = new Alumno("Luis Miguel", "001");
		Alumno alumno2 = new Alumno("Pepito los Palotes", "002");
		Alumno alumno3 = new Alumno("Juan Carlos", "003");
		Alumno alumno4 = new Alumno("Pedro Pedrito", "004");
		Alumno alumno5 = new Alumno("Gustavo Sanches", "005");
		Alumno alumno6 = new Alumno("Claudia Patricia", "006");

		curso1.addAlumno(alumno1);
		curso1.addAlumno(alumno2);
		curso1.addAlumno(alumno3);
		curso1.addAlumno(alumno4);
		curso1.addAlumno(alumno5);
		curso1.addAlumno(alumno6);
		
		//curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));
		
		Iterator<Alumno> alumnoIterator = curso1.getAlumnos().iterator();
		
		while(alumnoIterator.hasNext()) {
			System.out.println(alumnoIterator.next());
		}

	}
}




















