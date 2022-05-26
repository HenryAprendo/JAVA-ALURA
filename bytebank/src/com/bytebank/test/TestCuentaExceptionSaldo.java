package com.bytebank.test;
import com.bytebank.modelo.*;

public class TestCuentaExceptionSaldo {
	public static void main(String[] args) {
		CuentaCorriente cuenta = new CuentaCorriente(001, 1520);
		cuenta.depositar(500);
		cuenta.saca(400);
		System.out.println(cuenta.getSaldo());
		cuenta.saca(100);
		
	}
}
