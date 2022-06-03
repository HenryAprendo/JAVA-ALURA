package com.bytebank.test;

public class TestWrappers {
	public static void main(String[] args) {
		Double numeroDoble = 33.0;		//autoboxing
		Boolean verdadero = true;		//autoboxing
		
		Double numeroDoble2 = Double.valueOf(33.0);
		System.out.println(numeroDoble2);
		
		String numeroString = "43";
		Double stringToDouble = Double.valueOf(numeroString);
		System.out.println(stringToDouble);
		stringToDouble++;
		System.out.println(stringToDouble);
		
		
		//La superclase de los Wrappers Integer, Double etc es Number, por tanto puede hacer:
		Number entero = Integer.valueOf(50);
		Number decimal = Double.valueOf(30.15);
		
		
		
	}
}














