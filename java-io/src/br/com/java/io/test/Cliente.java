package br.com.java.io.test;

import java.io.Serializable;

public class Cliente implements Serializable {
	/**
	 * La serialización es obligatoria para que un objeto sea transportado en la red y guardarla en disco duro.
	 */
	private static final long serialVersionUID = -6084367685489490829L;
	private String nombre;
	private int documento;
	
	public Cliente(String nombre, int documento) {
		super();
		this.nombre = nombre;
		this.documento = documento;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getDocumento() {
		return this.documento;
	}
	
}
