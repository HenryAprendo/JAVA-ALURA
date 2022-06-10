package br.com.alura;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Clase13 {
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
		
		boolean valida = listaAlumnos.contains("Pedro pedrito");
		System.out.println(valida);
		
		String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();
		int tamano = max.length();
		System.out.println(max + " tiene " + tamano + " caracteres");
		
		listaAlumnos.removeIf(alumno -> "Juan Carlos".equalsIgnoreCase(alumno));
		listaAlumnos.forEach(alumno -> System.out.println(alumno));
		
	}
}
























