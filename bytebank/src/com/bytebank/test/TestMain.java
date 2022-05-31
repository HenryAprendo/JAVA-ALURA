package com.bytebank.test;

public class TestMain {

	public static void main(String[] args) {
		
		//El método tambien se le envian argumentos por consola
		for (int i = 0; i < args.length; i++ ) {
			System.out.println(args[i]);
		}
		
		
		//Forma clasica de declarar arrays
		int[] edades = new int[5];
		
		edades[2] = 30;
		System.out.println(edades[2]);
		System.out.println(edades[1]);
		//System.out.println(edades[6]); Lanza una excepción por no existir esta posición dentro del array
		
		//Operaciones con arrays
		int tamanoArray = edades.length;
		System.out.println(tamanoArray);
		
		//Imprimiendo cada valor del array
		for (int i = 0; i < tamanoArray; i++) {
			System.out.println(edades[i]);
		}
		
		//Forma literal de declarar arrays
		String[] frutas = {"Manzana", "Peras", "Banano"};
		
	}
	
	
}





