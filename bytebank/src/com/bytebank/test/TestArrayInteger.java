package com.bytebank.test;
import java.util.*;

public class TestArrayInteger {

	public static void main(String[] args) {
		//primitivo
		int numero = 40;
		
		//Pasar de un valor primitivo a un tipo objeto Integer para tener una lista de enteros.		
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(numero);  //Internamente hace autoBoxing (new Integer).
		
		//Wrapper
		//Lista de enteros debe hacerse de la siguiente forma.
		
		//Integer numeroObjeto = new Integer(40) deprecado
		Integer numeroObjeto = Integer.valueOf(numero);		//AutoBoxing
		lista.add(numeroObjeto);
		lista.add(Integer.valueOf(80));
		System.out.println(lista.get(0));
		
		Integer maximo = Integer.MAX_VALUE;
		
		//unboxing para pasar de un numero objeto a un int primitivo
		//int valorPrimitivo = numeroObjeto;
		int valorPrimtivo = numeroObjeto.intValue();  		//unBoxing
		
		//Ventajas del Wrapper
		byte byteInteger = numeroObjeto.byteValue();
		double doubleInteger = numeroObjeto.doubleValue();
		float floatInteger = numeroObjeto.floatValue();
		
		System.out.println(numeroObjeto.MAX_VALUE);		//print 2147483647
		System.out.println(numeroObjeto.MIN_VALUE);		//print -2147483648
		
		System.out.println(numeroObjeto.BYTES); 	// print 4 bytes ( 1 byte es 8 bits)
		System.out.println(numeroObjeto.SIZE);		// print 32 bits
		
		
	}
}

















