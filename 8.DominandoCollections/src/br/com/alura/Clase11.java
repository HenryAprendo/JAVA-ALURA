package br.com.alura;

import java.util.*;

public class Clase11 {
	public static void main(String[] args) {
		String alumno1 = "Luis Miguel";
		String alumno2 = "Pepito los Palotes";
		String alumno3 = "Juan Carlos";
		String alumno4 = "Pedro pedrito";
		String alumno5 = "Gustavo Sanches";
		String alumno6 = "Marcia Maria";
		
		/**
		 * HashSet no almacena los elementos en el orden en que fueron agregados y tampoco permiten valores duplicados.
		 */
		
		Set<String> listaAlumnos = new HashSet<>();
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		
		for (String alumno : listaAlumnos) {
			System.out.println(alumno);
		}
		
		
	}
}
