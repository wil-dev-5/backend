package com.ista.string.proyectofinalpw.models.service;

import java.util.List;

import com.ista.string.proyectofinalpw.models.entity.DetalleVenta;

public interface IDetalleVentaService {

	public List<DetalleVenta> findAll ();
	
	public DetalleVenta save(DetalleVenta detalle);

	public DetalleVenta findbyid(Long id);

	public void delete(Long id);
	
}
