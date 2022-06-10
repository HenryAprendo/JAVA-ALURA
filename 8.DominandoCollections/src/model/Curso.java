package model;

import java.util.*;

public class Curso {
	private String nombre;
	private int tiempo;
	private List<Aula> claseList = new ArrayList<>();
	private Collection<Alumno> alumnos = new HashSet<>(); 
	//private Collection<Alumno> alumnos = new LinkedHashSet<>();  ordena la lista
	
	public Curso(String nombre, int tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	
	public Curso(String nombre, int tiempo, List<Aula> claseList) {
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.claseList = claseList;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	public List<Aula> getClaseList() {
		return Collections.unmodifiableList( this.claseList);
		//La lista que devuelve es inmutable y es una forma de encapsulamiento donde solo internamente
		//en la clase con ayuda de sus métodos podremos hacer modificaciones a la lista.
	}
	
	public void setClaseList(List<Aula> claseList) {
		this.claseList = claseList;
	}
	
	
	public void addAula(Aula clase) {
		this.claseList.add(clase);
	}
	
	public void addAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
	}
	
	public boolean verificaAlumno(Alumno alumno) {
		return this.alumnos.contains(alumno);
	}
	
	public Collection<Alumno> getAlumnos() {
		return this.alumnos;
	}
	
	public Aula getClase(int index) {
		return claseList.get(index);
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}
	
}


















