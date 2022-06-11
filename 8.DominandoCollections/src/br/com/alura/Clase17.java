package br.com.alura;

import java.util.Optional;

import model.Alumno;
import model.Curso;

public class Clase17 {
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

		// curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));

		Optional<Alumno> alumno = curso1.getAlumnos().stream().filter(a -> "006".equalsIgnoreCase(a.getCodigo()))
				.findFirst();

		if (alumno.isPresent()) {
			System.out.println(alumno.get());
		}

		Alumno alumnoMap = curso1.getAlumnoMap().get("003");
		System.out.println(alumnoMap);

		curso1.getAlumnoMap().forEach((codigo, alumn) -> {
			System.out.println(alumn);
		});

		/**
		 * Para buscar valores unicos es mejor usar mapas, porque va directo en busqueda
		 * del valor y no tiene que recorrer todo como una lista normal con un for. Es
		 * un mejor performance. 
		 * 
		 * Un mapa trabaja bajo un concepto de (llave, valor), al tener una llave única
		 * por ejemplo un DNI, termina siendo más rápido la búsqueda de información.
		 */
	}
}
