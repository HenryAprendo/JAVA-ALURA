package com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorro;
import com.bytebank.modelo.CuentaCorriente;

public class TestLambdas {

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
		
		lista.sort( (Cuenta o1, Cuenta o2) -> {
				return Integer.compare(o1.getNumero(), o2.getNumero());
		});
		
		System.out.println("Ordenando por numero de cuenta");
		lista.forEach((cuenta) -> {
			System.out.println(cuenta);
		});
		
		lista.sort((Cuenta o1, Cuenta o2) -> o1.getTitular().getNombre().compareTo( o2.getTitular().getNombre() ) );
		System.out.println("Ordenando por nombre");
		for (Cuenta cuenta: lista) {
			System.out.println(cuenta);
		}
		
		Collections.sort(lista, (c1, c2) -> {
			return c1.getTitular().getNombre().compareTo(c2.getTitular().getNombre());
		});
		
	}	
}












