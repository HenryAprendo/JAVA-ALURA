package com.bytebank.test;

import java.util.ArrayList;

import com.bytebank.modelo.*;

public class TestGuardaCuentas {

	public static void main(String[] args) {
		GuardaCuentas guardaCuentas = new GuardaCuentas();
		
		Cuenta cc = new CuentaCorriente(11, 22);
		guardaCuentas.adicionar(cc);
		
		Cuenta cc2 = new CuentaCorriente(22, 44);
		guardaCuentas.adicionar(cc2);
		
		guardaCuentas.obtener(1);
		
		System.out.println(guardaCuentas.getClass());
		System.out.println(guardaCuentas.toString());
		System.out.println(guardaCuentas.hashCode());
		
		ArrayList<Object> numeros = new ArrayList<Object>();
		numeros.add(3);
		System.out.println(numeros.get(0));
		
		
	}
	
}
