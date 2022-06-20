package com.alura.jdbc;

import javax.swing.JFrame;
import com.alura.jdbc.view.ControlDeStockFrame;

public class ControlDeStockMain {
	public static void main(String[] args) {
		ControlDeStockFrame produtoCategoriaFrame = new ControlDeStockFrame();
		produtoCategoriaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


/**
 *El patron de diseño implementado en este proyecto es el MVC Model View Controller.
 *Donde la clase ControlDeStockFrame representa el View, Producto y Producto DAO el model y ProductoController
 *el controller.
 *El model se encarga de toda la lógica para conectar y hacer todas las operaciones con la base de datos.
 *Este es un standar de dieño que nos permite tener un código mas limpio y organizado, facil de mantener y 
 *con las responsabilidades definidas y separadas, a tal punto de que nuestro proyecto es extensible.
 * 
 */
