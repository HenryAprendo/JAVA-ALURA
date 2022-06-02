package com.bytebank.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.bytebank.modelo.*;

public class TestArrayList {
	public static void main(String[] args) {
		
		//Transformando un Array en una lista
	    //List<String> argumentos = Arrays.asList(args);
			
		//implementado la interface List de quien depende LinkenList(Listas anexadas), ArrayList y Vector. 
		List<Cliente> listaCliente = new LinkedList<>();
		Cliente cliente = new Cliente();
		listaCliente.add(cliente);
		System.out.println(listaCliente.get(0));
		
		// parametrizamos arrayList usando <> lo cual permite forzar a que el arreglo solo permita un solo tipo de elementos
		
		ArrayList<Cuenta> lista = new ArrayList<>();
		
		Cuenta cc = new CuentaCorriente(11,55);
		Cuenta cc2 = new CuentaCorriente(33, 99);
		Cuenta cc3 = new CuentaCorriente(11,55);  //Referencia distinta, pero internamente igual a cc. El método equals lo detectaria.
		
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
		
		
		//Otros métodos de los ArrayList
		/**
		 * El método contains internamente utiliza el método equals para hacer las comparaciones. Por default el compara las referencias en  
		 * la memoria, mas no los valores internos de estas. Es necesario entonces reesccribir el método equals para que haga comparaciones de nuestros
		 * valores internos.
		 * Ya que si lo dejamos asi, y creamos un objeto new CuentaCorriente cc3 con los mismos valores de cc1 regresaria un false porque lo
		 * que está comparando es la referencia mas no el valor del objeto interno. En la clase Cuenta se reescribio equals para lograr 
		 * el resultado requerido, porque que no podemos tener dos cuentas con los mismos valores aunque sus referencias sean distintas. 
		 */
		boolean contiene = lista.contains(cc);
		if (contiene) {
			System.out.println("SI es igual (equals) correcto");
		}
		
		//Aun cuando cc3 nos está agregada a lista, sin embargo dentro de lista si hay un objeto con los mismos valores. Y podria generar
		//confunción, lo cual debe ser corregido desde el mismo momento que se genero un objeto igual lo cual no puede ser o en caso tal no
		//ser agregado por estar repetido.
		boolean contiene1 = lista.contains(cc3);
		if (contiene1) {
			System.out.println("SI es igual (equals) Es un error");
		}
		
	}
}

/**
 * Un objeto del tipo ArrayList es un objeto utilitario de java.util que tiene métodos para el manejo de listas 
 * o de vectores. Esta basado en la clase Object[] por lo cual el arreglo puede recibir distintas referencias,
 * que despues para obtenerlas deben ser casteadas.
 */
























