package com.bytebank.test;
import com.bytebank.modelo.*;

public class TestCuenta {
	
	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(1, 2);		
		CuentaAhorro ca = new CuentaAhorro(3, 4);
		
		cc.depositar(2000);
		cc.transferir(1000, ca);		//Por cada transferencia descuenta una comisión de cc.
		
		System.out.println("El saldo de cc es: " + cc.getSaldo());
		System.out.println("El saldo de ca es: " + ca.getSaldo());
		
		
	}
	
}
