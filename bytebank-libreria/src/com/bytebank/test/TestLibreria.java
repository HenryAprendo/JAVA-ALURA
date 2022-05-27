package com.bytebank.test;

import com.bytebank.modelo.*;

public class TestLibreria {
	public static void main(String[] args) {
		CuentaCorriente cuenta = new CuentaCorriente(001, 100);
	}
}

/**
 * Generar un archivo jar del proyecto
 * 1. Click derecho sobre el proyecto, Export, Java, Javafile, nombre del archivo, ruta y listo.
 * 
 * 2. El archivo.jar para ser utilizado en otro proyecto, lo copiamos y lo guardamos en una carpeta que
 * por convencion se llama lib. Luego haciendo click derecho sobre el archivo.jar lo agregamos al path, en Build path y luego
 * Add to Build path. 
 * Aparece un Referenced Libraries, donde indica que librerias esta referenciando nuestro proyeecto
 * De esta forma ya lo hemos agregado al conjunto de librerias build path que eclipse va a tomar para compilar 
 * mi proyecto.
 */
