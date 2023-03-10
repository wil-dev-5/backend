package com.v93.service;

import java.util.List;

import com.v93.entity.Producto;


public interface IProductoService {
	
	public List<Producto> findAll ();
	
	public Producto save(Producto producto);

	public Producto findbyid(Long id);

	public void delete(Long id);

}
