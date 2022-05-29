package com.bytebank.test;

public class Mutables {
	public static void main(String[] args) {

		String texto = "Ayuda";
		texto = texto.concat("-");
		texto = texto.concat("me ");
		texto = texto.concat("subi ");
		texto = texto.concat("en el ");
		texto = texto.concat("omnibus ");
		texto = texto.concat("equivocado ");
		System.out.println(texto);

		/**
		 * En este peque�o ejemplo ya hemos creado varios objetos, solo porque estamos
		 * concatenando algunos String. Esto no es bueno pensando en el rendimiento y
		 * para resolver esto existe la clase StringBuilder que ayuda a concatenar
		 * Strings de manera m�s eficiente.
		 * 
		 * Vea el mismo c�digo usando StringBuilder:
		 */

		StringBuilder builder = new StringBuilder("Ayuda");
		builder.append("-");
		builder.append("me ");
		builder.append("subi ");
		builder.append("en el ");
		builder.append("omnibus ");
		builder.append("equivocado ");
		String texto2 = builder.toString();
		System.out.println(texto2);
	}

	/**
	 * StringBuilder es una clase com�n. Observe que usamos new para crear el
	 * objeto. Adem�s, como el objeto es mutable, usamos la misma referencia, sin
	 * nuevas asignaciones.
	 */
}
