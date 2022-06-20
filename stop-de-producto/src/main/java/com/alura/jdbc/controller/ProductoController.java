package com.alura.jdbc.controller;

import com.alura.jdbc.dao.ProductoDAO;
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
	
	private ProductoDAO productoDAO;
	
	public ProductoController() {
		this.productoDAO = new ProductoDAO(new ConnectionFactory().recuperaConexion());
	}
	
	public int modificar(Producto producto) {
		return this.productoDAO.modificar(producto);
	}

	public int eliminar(Integer id) {
		return productoDAO.eliminar(id);
	}
	
	public List<Producto> listar() {
		return productoDAO.listar();

	}

	public void guardar(Producto producto){
		productoDAO.guardar(producto);
	}
	
	/**
	 * Clase ProductoDAO,  DAO Data Access Object.
	 * Estas clases trabajan con las operaciones de acceso a los datos de una entidad
	 */
	
}






