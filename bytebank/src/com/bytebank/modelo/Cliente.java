package com.bytebank.modelo;

public class Cliente implements Autenticable {
	private String nombre;
	private String telefono;
	private String documento;
	
	private AutenticacionUtil util;
	
	
	public Cliente() {
		this.util = new AutenticacionUtil();
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	//Métodos de la interface autenticable que obligatoriamente se deben implementar por ser abstractos
	//de la interface.
	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);		
	}
	
	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}
	
}
