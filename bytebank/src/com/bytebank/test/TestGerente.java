package com.bytebank.test;
import com.bytebank.modelo.*;

public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNombre("Henry");
		gerente.setClave("1543");
		gerente.setSalario(8000);
		
		System.out.println(gerente.getNombre());
		System.out.println(gerente.iniciarSesion("1543"));
		System.out.println(gerente.getBonificacion());
		
	}
}
