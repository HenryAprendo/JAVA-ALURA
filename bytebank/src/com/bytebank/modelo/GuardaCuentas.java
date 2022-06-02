package com.bytebank.modelo;

public class GuardaCuentas {

	Cuenta[] cuentas = new Cuenta[10];
	int indice = 0;
	
	public void adicionar(Cuenta cc) {
		cuentas[indice] = cc;
		indice++;
	}

	public Cuenta obtener(int indice) {
		return cuentas[indice];
		
	}	
	

	
}
