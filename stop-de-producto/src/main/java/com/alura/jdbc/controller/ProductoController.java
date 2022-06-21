package com.alura.jdbc.controller;

import com.alura.jdbc.dao.ProductoDAO;
import com.alura.jdbc.factory.*;
import com.alura.jdbc.modelo.Categoria;
import com.alura.jdbc.modelo.Producto;

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
	
	public List<Producto> listar(Categoria categoria) {
		return productoDAO.listar(categoria.getId());
	}

	public void guardar(Producto producto, Integer categoriaId){
		producto.setCategoriaId(categoriaId);
		productoDAO.guardar(producto);
	}
	
	/**
	 * Clase ProductoDAO,  DAO Data Access Object.
	 * Estas clases trabajan con las operaciones de acceso a los datos de una entidad
	 */
	
}






