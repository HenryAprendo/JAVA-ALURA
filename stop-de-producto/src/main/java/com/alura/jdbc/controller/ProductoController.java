package com.alura.jdbc.controller;

import com.alura.jdbc.factory.*;
import com.alura.jdbc.modelo.Producto;
import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.*;

public class ProductoController {
	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) throws SQLException {
		final Connection con = new ConnectionFactory().recuperaConexion();
		
		try(con){
			
			final PreparedStatement statement = con.prepareStatement(
					"UPDATE PRODUCTO SET" + " NOMBRE = ?" + ", DESCRIPCION = ?" + ", CANTIDAD = ?" + " ID = ?");
			
			try(statement){
				statement.setString(1, nombre);
				statement.setString(2, descripcion);
				statement.setInt(3, cantidad);
				statement.setInt(4, id);
		
				statement.execute();
		
				int updateCount = statement.getUpdateCount();
		
				return updateCount;
			}
		}
	}

	public int eliminar(Integer id) throws SQLException {
		final Connection con = new ConnectionFactory().recuperaConexion();
		
		try(con) {
			
			final PreparedStatement statement = con.prepareStatement("DELETE FROM PRODUCTO WHERE ID = ?");
			try(statement){
				statement.setInt(1, id);
				statement.execute();
		
				int updateCount = statement.getUpdateCount();
		
				return updateCount;
			}
			
		}	
	}

	public List<Map<String, String>> listar() throws SQLException {
		// 1. hacer petición a la base de datos
		final Connection con = new ConnectionFactory().recuperaConexion();

		try(con){
							
			// 2. crear los statement para utilizar los query de mysql (SELECT, etc) con los
			// que hacemos la consulta
			final PreparedStatement statement = con.prepareStatement("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM PRODUCTO");
			
			try(statement){
				
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
		
				return resultado;
			}
		}
	}

	public void guardar(Producto producto) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory();
		final Connection con = factory.recuperaConexion();

		try (con) {

			con.setAutoCommit(false);
			// Evitando la sql injection con preparedStatement
			final PreparedStatement statement = con.prepareStatement(
					"INSERT INTO PRODUCTO " + "(nombre, descripcion, cantidad)" + "VALUES (?,?,?)",
					Statement.RETURN_GENERATED_KEYS);

			// Control de transacciones. Guardamos todo o no se guarda nada.
			try (statement) {
					
				ejecutaRegistro(producto, statement);
				con.commit();
				
			} catch (Exception e) {
				con.rollback();
			}

		}
	}


	private void ejecutaRegistro(Producto producto, PreparedStatement statement) throws SQLException {

		statement.setString(1, producto.getNombre());
		statement.setString(2, producto.getDescripcion());
		statement.setInt(3, producto.getCantidad());
		statement.execute();

		final ResultSet resultSet = statement.getGeneratedKeys();

		try (resultSet) {
			while (resultSet.next()) {
				producto.setId(resultSet.getInt(1));
				System.out.println(String.format("Fue insertado el producto %s", producto));
			}
		}

		/**
		 * Implementación de try with resources, para garantizar el cierre de conexiones
		 * o recursos de forma mas segura.
		 * 
		 * %s  indica string
		 * %d  indica digito
		 * 
		 */
	}

}
