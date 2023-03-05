package com.ista.string.proyectofinalpw.models.service;

import java.util.List;

import com.ista.string.proyectofinalpw.models.entity.OrdenVenta;

public interface IOrdenVentaService {

	public List<OrdenVenta> findAll ();
	
	public OrdenVenta save(OrdenVenta orden);

	public OrdenVenta findbyid(Long id);

	public void delete(Long id);
	
}
