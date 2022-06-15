package com.alura.jdbc.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class ProductoController {
	public void modificar(String nombre, String descripcion, Integer id) {
		// TODO
	}

	public void eliminar(Integer id) {
		// TODO
	}

	public List<Map<String, String>> listar() throws SQLException {
		// 1. hacer petición a la base de datos
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC",
				"root", 
				"root1234");
		
		// 2. crear los statement para utilizar los query de mysql (SELECT, etc) con los que hacemos la consulta
		Statement statement =  con.createStatement();
		
		//3. devuelve true si es una lista
		statement.execute("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM PRODUCTO");

		// 4. obtenemos la lista de la solicitud
		ResultSet resultSet = statement.getResultSet();
		
		// 5. Almacenamos los productos, cada uno sera una lista de Map
		List<Map<String, String>> resultado = new ArrayList<>();
		
		//6. iteramos sobre cada producto y lo guardamos en la Lista de Maps
		while(resultSet.next()) {
			Map<String, String> fila = new HashMap<>();
			fila.put("ID", String.valueOf(resultSet.getInt("ID")));
			fila.put("NOMBRE", resultSet.getString("NOMBRE"));
			fila.put("DESCRIPCION", resultSet.getString("DESCRIPCION"));
			fila.put("CANTIDAD", String.valueOf(resultSet.getInt("CANTIDAD")));
			resultado.add(fila);
		}
		
		con.close();
		
		return resultado;
	}

    public void guardar(Object producto) {
		// TODO
	}
}









