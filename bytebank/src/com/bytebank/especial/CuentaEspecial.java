package com.bytebank.especial;
import com.bytebank.modelo.Cuenta;

/**
 * Documentación
 * @author 57314
 *
 */
//Comentarios
/*
 * Comentarios
 * */
public class CuentaEspecial extends Cuenta {
	
	@Override
	public void depositar(double valor) {
		this.saldo = 0;
		//super.saldo = 0;
	}

	/**
	 * Este ejercicio es para demostrar que los atributos de una clase con un modificador de acceso protected
	 * pueden ser accedidos en clases hijas por herancia y aun desde un package distinto. 
	 * En este caso saldo pertenece a la clase madre Cuenta que se importa de otro package.
	 * podemos acceder como :
	 * super.saldo = 2;
	 * this.saldo = 2
	 * */
	
	
}
