package com.bytebank.test;

import com.bytebank.modelo.*;

public class CasteoCuentas {

	public static void main(String[] args) {
		
		//Uso de la super clase Object de mayor jerarquia, me permite almacenar distintos tipos de referencias.
		Object[] referencias = new Object[5];
		
		CuentaCorriente cc = new CuentaCorriente(99, 11);
		CuentaAhorro ca = new CuentaAhorro(88, 22);
		Cliente cliente = new Cliente();
		
		//Varios tipos de referencia
		referencias[0] = cc;
		referencias[1] = ca;
		referencias[2] = cliente;
		
		//casteo de datos
		CuentaCorriente cuenta = (CuentaCorriente) referencias[0];
		System.out.println(cuenta);
		//El casteo permite en este caso tratar la referencia[0] como un tipo de CuentaCorriente, solo cuando estamos 
		//seguros de que el valor de la posición es de este tipo. En este caso referencia es del tipo Object, por eso es 
		//necesario el casteo.(No importando que su valor contenido es un objeto tipo CuentaCorriente, prevalece Object).
		
		Cliente obtenido = (Cliente) referencias[2];
		System.out.println(obtenido);
		
		for (int i = 0; i < referencias.length; i++) {
			System.out.println(referencias[i]);
		}
		
	}
	
}
