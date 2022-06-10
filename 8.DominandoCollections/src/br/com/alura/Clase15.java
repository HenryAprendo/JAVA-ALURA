package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

import model.Alumno;
import model.Curso;

public class Clase15 {
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

		Alumno nuevoAlumno = new Alumno("Luis Miguel", "001");

		System.out.println(alumno1.equals(nuevoAlumno));
		System.out.println(curso1.verificaAlumno(nuevoAlumno));
		
		System.out.println(curso1.getAlumnos().contains(nuevoAlumno));
	}
}











