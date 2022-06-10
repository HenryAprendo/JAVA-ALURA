package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import model.Alumno;

public class Clase14 {
	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Luis Miguel", "001");
		Alumno alumno2 = new Alumno("Pepito los Palotes", "002");
		Alumno alumno3 = new Alumno("Juan Carlos", "003");
		Alumno alumno4 = new Alumno("Pedro Pedrito", "004");
		Alumno alumno5 = new Alumno("Gustavo Sanches", "005");
		Alumno alumno6 = new Alumno("Claudia Patricia", "006");

		Collection<Alumno> listaAlumnos = new HashSet<>();
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);

		Alumno nuevoAlumno = new Alumno("Luis Miguel", "001");

		// Es necesario reescribir el método equals de Alumno para que compare por
		// nombre , mas no por referencias en memoria.
		// Tambien reescribir el this.nombre.hashCode() para que agregue a un hash a
		// cada nombre de la lista, algo que no necesita un ArrayList.
		System.out.println(alumno1.equals(nuevoAlumno));
		System.out.println(listaAlumnos.contains(nuevoAlumno));

		/**
		 * ¿Por qué sobrescribir el método equals y hashCode, en una clase? Porque al
		 * usar el método contains usa el hashCode y el equals es usado para comparar
		 * valores, es una necesidad primordial sobrescribir estos métodos, para buscar
		 * los resultados esperados en nuestras comparaciones. Aparte de los descrito en
		 * la respuesta, es bueno hacer esa sobrescritura de métodos, para luego tener
		 * la capacidad de migrar para alguna otra interfaz sin la mayor preocupación de
		 * obtener resultados no esperados.
		 * 
		 */

	}
}
