package com.bytebank.test;
import java.util.*;

import com.bytebank.modelo.*;

public class TestOrdenarLista {
	
	public static <T> void main(String[] args) {
		Cuenta cc1 = new CuentaCorriente(32, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNombre("Diego");
		cc1.setTitular(clienteCC1);
		cc1.depositar(333.0);
		
		Cuenta cc2 = new CuentaAhorro(12, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNombre("Renato");
		cc2.setTitular(clienteCC2);
		cc2.depositar(444.0);
		
		Cuenta cc3 = new CuentaCorriente(50, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNombre("Liam");
		cc3.setTitular(clienteCC3);
		cc3.depositar(111.0);
		
		Cuenta cc4 = new CuentaAhorro(47, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNombre("Edmilson");
		cc4.setTitular(clienteCC4);
		cc4.depositar(222.0);
		
		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		//Ordenado por número de cuentas
		Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
		lista.sort(comparator);
		
		//Despues de ordenar
		System.out.println("Ordenando por numero de cuenta");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		
		Comparator<Cuenta> comparator1 = new OrdenarPorNombreDeTitular();
		lista.sort(comparator1);
		System.out.println("Ordenando por nombre del titular");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		
		//Ordenado como se hacia en java 1.7 aun en bancos y entidades financieras
		Collections.sort(lista);
		System.out.println("Ordenando por orden natural definido en clase cuenta método compareTo");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		//Para invertir el orden de la lista
		Collections.reverse(lista);
		
		//Para mezclar existe el método shuffle y para girar existe el método de rotate:
		Collections.shuffle(lista);
		Collections.rotate(lista, 5); //rotar 5 posiciones
		
	}
		
}



class OrdenadorPorNumeroCuenta implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		//Forma basica
		//if(o1.getNumero() == o2.getNumero()) {
			//return 0;
		//}
		//else if (o1.getNumero() > o2.getNumero()) {
			//return 1;
		//}
		//else {
			//return -1;
		//}
		
		//forma intermedia
		//return o1.getNumero() - o2.getNumero();
		
		//forma Wrapper
		return Integer.compare(o1.getNumero(), o2.getNumero());
	}
	
}



class OrdenarPorNombreDeTitular implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
	}
	
}






