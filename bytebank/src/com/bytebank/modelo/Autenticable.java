package com.bytebank.modelo;

public interface Autenticable {
		
	public void setClave(String clave);
	
	public boolean iniciarSesion(String clave);
	
}


//Toda interfaz por default es abstracta, y por lo tanto sus métodos.