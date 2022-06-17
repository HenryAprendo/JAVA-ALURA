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
		String nombre = producto.get("NOMBRE");
		String descripcion = producto.get("DESCRIPCION");
		Integer cantidad = Integer.valueOf(producto.get("CANTIDAD"));
		Integer maximoCantidad = 50;
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection con = factory.recuperaConexion();
		con.setAutoCommit(false);
		//setAutoCommit nos permite tomar control de la transacción que tiene la jdbc, de tal forma que si por alguna razón ocurre un error la 
		//la transacción no se va a hacer de forma incompleta, dejando al aire el resto de productos. Y por tanto no saldra en la 
		//base de datos.
		
		
		//Evitando la sql injection con preparedStatement
		PreparedStatement statement = con.prepareStatement("INSERT INTO PRODUCTO "
				+ "(nombre, descripcion, cantidad)"
				+ "VALUES (?,?,?)",
				Statement.RETURN_GENERATED_KEYS);
			
		//Control de transacciones. Guardamos todo o no se guarda nada.
		try {
			do {
				//Garantiza que solo se insertara una cantidad de 50, si es mayor se ejecutara una nueva inserción con el resto.
				int cantidadParaGuardar = Math.min(cantidad, maximoCantidad);		//Toma entre dos valores el menor
				ejecutaRegistro(nombre, descripcion, cantidadParaGuardar, statement);
				cantidad -= maximoCantidad;
			}while(cantidad > 0);
			
			con.commit();
		}catch(Exception e) {
			con.rollback();
		}
		
		statement.close();
		con.close();
	}

	private void ejecutaRegistro(String nombre, String descripcion, Integer cantidad, PreparedStatement statement) throws SQLException {
		
		if (cantidad < 50) throw new RuntimeException("Ocurrio un error");	
		//simula un error en una transaccion.
					
		statement.setString(1, nombre);
		statement.setString(2, descripcion);
		statement.setInt(3, cantidad);
				
		statement.execute();
		//los string para MYSQL son con comillas simples ' "string" ';
		
		ResultSet resultSet = statement.getGeneratedKeys();
		
		while(resultSet.next()) {
			System.out.println( String.format("Fue insertado el producto de Id %d" , resultSet.getInt(1)));
		}
	}

}





