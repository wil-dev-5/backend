package com.v93.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.v93.dao.IDetalleVentaDao;
import com.v93.entity.DetalleVenta;


@Service
public class DetalleVentaImp implements IDetalleVentaService{

	@Autowired
	private IDetalleVentaDao detalleDao;

	@Override
	@Transactional
	public List<DetalleVenta> findAll() {
		return (List<DetalleVenta>) detalleDao.findAll();
	}

	@Override
	public DetalleVenta save(DetalleVenta detalle) {
		return detalleDao.save(detalle);
	}

	@Override
	@Transactional
	public DetalleVenta findbyid(Long id) {
		return detalleDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		detalleDao.deleteById(id);
	}
	
	
}
