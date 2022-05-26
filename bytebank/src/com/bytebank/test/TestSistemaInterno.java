package com.bytebank.test;
import com.bytebank.modelo.*;

public class TestSistemaInterno {
	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		
		Gerente gerente = new Gerente();
		gerente.setClave("AluraCursosOnLine");
		Administrador admin = new Administrador();
		Cliente cliente = new Cliente();
		
		sistema.autentica(gerente);
		sistema.autentica(admin);
		sistema.autentica(cliente);
	}
}
