package com.bytebank.test;

import com.bytebank.modelo.CuentaCorriente;

public class TestArregloReferencias {
	
	public static void main(String[] args) {
		
		CuentaCorriente cc = new CuentaCorriente(33,44);
		
		CuentaCorriente[] cuenta = new CuentaCorriente[10];
		
		cuenta[1] = cc;
		System.out.println(cc);
		System.out.println(cuenta[1]);
		
		//Instanciando directamente en la posición 
		cuenta[0] = new CuentaCorriente(11, 99);
		System.out.println(cuenta[0].getAgencia());
		
		for (int i = 0; i < cuenta.length; i++) {
			System.out.println(cuenta[i]);
		}
		
	}

}







