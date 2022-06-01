package com.bytebank.test;

import java.util.ArrayList;
import com.bytebank.modelo.*;

public class TestArrayList {
	public static void main(String[] args) {
		
		// parametrizamos arrayList usando <> lo cual permite forzar a que el arreglo solo permita un solo tipo de elementos
		ArrayList<Cuenta> lista = new ArrayList<>();
		
		Cuenta cc = new CuentaCorriente(11,55);
		Cuenta cc2 = new CuentaCorriente(33, 99);
		
		lista.add(cc);
		lista.add(cc2);
		
		//Por no ser del tipo Cuenta no es posible agregarlos al arreglo, que fue forzado a ser de solo Cuenta
		// Cliente cliente = new Cliente();
		// lista.add(cliente);
		
		Cuenta obtenerCuenta = lista.get(0);
		System.out.println(obtenerCuenta);
		
		//Implementando un for
		System.out.println("For clasico");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println();
		
		//implementado un for of
		System.out.println("For of");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
	}
}

/**
 * Un objeto del tipo ArrayList es un objeto utilitario de java.util que tiene métodos para el manejo de listas 
 * o de vectores. Esta basado en la clase Object[] por lo cual el arreglo puede recibir distintas referencias,
 * que despues para obtenerlas deben ser casteadas.
 */













