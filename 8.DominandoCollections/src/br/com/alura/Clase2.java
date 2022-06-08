package br.com.alura;

import java.util.ArrayList;

public class Clase2 {
	public static void main(String[] args) {
		String variable1 = "Ejemplo 1";
		String variable2 = "Ejemplo 2";
		String variable3 = "Ejemplo 3";
		String variable4 = "Ejemplo 4";
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add(variable1);
		lista.add(variable2);
		lista.add(variable3);
		lista.add(variable4);
		
		//FORMAS DE RECORRER UN ARREGLO
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("Clasica " + lista.get(i));
		}
		
		//For of
		for (String item: lista) {
			System.out.println(item);
		}
		
		//Método forEach y lambdas
		lista.forEach( item -> System.out.println(item) );
	}
}












