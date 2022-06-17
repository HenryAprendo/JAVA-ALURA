package com.alura.jdbc.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	private DataSource datasource;
	
	public ConnectionFactory() {
		var pooledDataSource = new ComboPooledDataSource(); 	// Es la clase del driver c3p0, para el pool de conexiones
		pooledDataSource.setJdbcUrl("jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC");
		pooledDataSource.setUser("root");
		pooledDataSource.setPassword("root1234");
		pooledDataSource.setMaxPoolSize(10);
		
		datasource = pooledDataSource;
	}
	
	public Connection recuperaConexion() throws SQLException {
		return this.datasource.getConnection();
	}
	
}


/**
 * Pattern desing Factory Method.
 * Permite encapsular un método y centralizar la logica en un solo punto.
 * */
 