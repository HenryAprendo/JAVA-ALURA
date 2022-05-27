package com.bytebank.modelo;

/**
 * Modificadores de acceso: delimitan el alcance de objetos, atributos, métodos etc.
 * public: Accesible desde cualquier parte
 * default: Accesible dentro del mismo paquete
 * protected: default + clases hijas
 * private: Accesible solo desde la clase misma
 * */



public class Administrador extends Funcionario implements Autenticable {
	
	private AutenticacionUtil util;
	
	public Administrador() {
		this.util = new AutenticacionUtil();
	}

	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

}
