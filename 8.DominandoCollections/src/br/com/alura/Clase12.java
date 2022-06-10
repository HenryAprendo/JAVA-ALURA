package br.com.alura;

import java.util.*;

public class Clase12 {
	public static void main(String[] args) {
		String alumno1 = "Luis Miguel";
		String alumno2 = "Pepito los Palotes";
		String alumno3 = "Juan Carlos";
		String alumno4 = "Pedro pedrito";
		String alumno5 = "Gustavo Sanches";
		String alumno6 = "Marcia Maria";
		String alumno7 = "Marcia Maria";
		String alumno8 = "Marcia Maria";
		String alumno9 = "Gustavo Sanches";
		
		/**
		 * Una de las principales ventajas es cuando adicionamos registros a un Set el no guarda registros duplicados.
		 * Esta interface Set al igual que List tienen como clase padre a Collections. Por tanto podriamos referenciar a Collection
		 * Collections<String> listaALumnos = new HashSet<>()
		 */
		
		//Collection<String> listaALumnos = new HashSet<>();
		Set<String> listaAlumnos = new HashSet<>();
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		listaAlumnos.add(alumno7);
		listaAlumnos.add(alumno8);
		listaAlumnos.add(alumno9);
		
		listaAlumnos.forEach(alumno -> System.out.println(alumno));
		System.out.println(listaAlumnos);
		
	}
}

















