package com.bytebank.modelo;

public class SistemaInterno {
	private String clave = "AluraCursosOnLine";
	
	public boolean autentica(Autenticable autentic) {
		
		boolean puedeIniciarSesion =  autentic.iniciarSesion(this.clave);
		
		if (puedeIniciarSesion) {
			System.out.println("Login Exitoso!");
			return true;
		}
		else {
			System.out.println("Error en Login");
			return false;
		}
	}
}
