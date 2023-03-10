package com.v93.service;

import java.util.List;

import com.v93.entity.DetalleVenta;


public interface IDetalleVentaService {

	public List<DetalleVenta> findAll ();
	
	public DetalleVenta save(DetalleVenta detalle);

	public DetalleVenta findbyid(Long id);

	public void delete(Long id);
	
}
