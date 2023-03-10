package com.v93.service;

import java.util.List;

import com.v93.entity.OrdenVenta;


public interface IOrdenVentaService {

	public List<OrdenVenta> findAll ();
	
	public OrdenVenta save(OrdenVenta orden);

	public OrdenVenta findbyid(Long id);

	public void delete(Long id);
	
}
