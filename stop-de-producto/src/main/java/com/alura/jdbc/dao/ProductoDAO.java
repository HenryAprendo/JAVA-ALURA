package com.alura.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Producto;

public class ProductoDAO {

	final private Connection con;

	public ProductoDAO(Connection con) {
		this.con = con;
	}

	public void guardar(Producto producto) {
		try (con) {

			// Evitando la sql injection con preparedStatement
			final PreparedStatement statement = con.prepareStatement(
					"INSERT INTO PRODUCTO " + "(nombre, descripcion, cantidad)" + "VALUES (?,?,?)",
					Statement.RETURN_GENERATED_KEYS);

			// Control de transacciones. Guardamos todo o no se guarda nada.
			try (statement) {
				ejecutaRegistro(producto, statement);
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
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
		 * %s indica string %d indica digito
		 * 
		 */
	}

	public List<Producto> listar() {
		
		// 5. Almacenamos los productos, cada uno sera una lista de Map
		List<Producto> resultado = new ArrayList<>();
		
		final Connection con = new ConnectionFactory().recuperaConexion();
		
		try(con){
							
			// 2. crear los statement para utilizar los query de mysql (SELECT, etc) con los
			// que hacemos la consulta
			final PreparedStatement statement = con.prepareStatement("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM PRODUCTO");
			
			try(statement){
				
				// 3. devuelve true si es una lista
				statement.execute();
		
				// 4. obtenemos la lista de la solicitud
				final ResultSet resultSet = statement.getResultSet();
		
				try(resultSet){
					// 6. iteramos sobre cada producto y lo guardamos en la Lista de Maps
					while (resultSet.next()) {
						Producto fila = new Producto(resultSet.getInt("ID"),
								resultSet.getString("NOMBRE"), 
								resultSet.getString("DESCRIPCION"),
								resultSet.getInt("CANTIDAD"));
						
						resultado.add(fila);
					}
				}
		
				return resultado;
			}
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public int eliminar(Integer id) {
		
		try {
			
			final PreparedStatement statement = con.prepareStatement("DELETE FROM PRODUCTO WHERE ID = ?");
			try(statement){
				statement.setInt(1, id);
				statement.execute();
				int updateCount = statement.getUpdateCount();
				return updateCount;
			}
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public int modificar(Producto producto) {
		
		try {
				
	        final PreparedStatement statement = con.prepareStatement(
	                "UPDATE PRODUCTO SET "
	                + " NOMBRE = ?, "
	                + " DESCRIPCION = ?,"
	                + " CANTIDAD = ?"
	                + " WHERE ID = ?");
	        
			try(statement){
				statement.setString(1, producto.getNombre());
				statement.setString(2, producto.getDescripcion());
				statement.setInt(3, producto.getCantidad());
				statement.setInt(4, producto.getId());
			
				statement.execute();
			
				int updateCount = statement.getUpdateCount();
			
				return updateCount;
			}
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}








