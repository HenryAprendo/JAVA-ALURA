package com.alura.jdbc.controller;

import com.alura.jdbc.factory.*;
import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.*;

public class ProductoController {
	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) throws SQLException {
		Connection con = new ConnectionFactory().recuperaConexion();
		PreparedStatement statement = con.prepareStatement("UPDATE PRODUCTO SET"
				+ " NOMBRE = ?" 
				+ ", DESCRIPCION = ?" 
				+ ", CANTIDAD = ?" 
				+ " ID = ?");
		statement.setString(1, nombre);
		statement.setString(2, descripcion);
		statement.setInt(3, cantidad);
		statement.setInt(4, id);
		
		statement.execute();

		int updateCount = statement.getUpdateCount();
		con.close();
		
		return updateCount;
	}

	public int eliminar(Integer id) throws SQLException {
		Connection con = new ConnectionFactory().recuperaConexion();
		PreparedStatement statement = con.prepareStatement("DELETE FROM PRODUCTO WHERE ID = ?");
		statement.setInt(1,id);		
		statement.execute();

		int updateCount = statement.getUpdateCount();
		
		con.close();
		
		return updateCount;
		
	}

	public List<Map<String, String>> listar() throws SQLException {
		// 1. hacer petición a la base de datos
		Connection con = new ConnectionFactory().recuperaConexion();

		// 2. crear los statement para utilizar los query de mysql (SELECT, etc) con los
		// que hacemos la consulta
		PreparedStatement statement = con.prepareStatement("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM PRODUCTO");

		// 3. devuelve true si es una lista
		statement.execute();

		// 4. obtenemos la lista de la solicitud
		ResultSet resultSet = statement.getResultSet();

		// 5. Almacenamos los productos, cada uno sera una lista de Map
		List<Map<String, String>> resultado = new ArrayList<>();

		// 6. iteramos sobre cada producto y lo guardamos en la Lista de Maps
		while (resultSet.next()) {
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

	public void guardar(Map<String, String> producto) throws SQLException {

		Connection con = new ConnectionFactory().recuperaConexion();
		PreparedStatement statement = con.prepareStatement("INSERT INTO PRODUCTO "
				+ "(nombre, descripcion, cantidad)"
				+ "VALUES (?,?,?)",
				Statement.RETURN_GENERATED_KEYS);
		
		statement.setString(1, producto.get("NOMBRE"));
		statement.setString(2, producto.get("DESCRIPCION"));
		statement.setInt(3, Integer.valueOf( producto.get("CANTIDAD") ));
				
		statement.execute();
		//los string para MYSQL son con comillas simples ' "string" ';
		
		ResultSet resultSet = statement.getGeneratedKeys();
		
		while(resultSet.next()) {
			System.out.println( String.format("Fue insertado el producto de Id %d" , resultSet.getInt(1)));
		}
	}

}





