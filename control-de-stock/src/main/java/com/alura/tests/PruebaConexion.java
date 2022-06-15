package com.alura.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC",
				"root",
				"root1234");
		
		System.out.println("Terminando conexión");
		
		con.close();
	}
}



/**
 * getConnection recibe la url, el usuario y la clave de la base de datos
 * */
 