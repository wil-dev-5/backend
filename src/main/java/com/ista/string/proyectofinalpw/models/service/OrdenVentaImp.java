package com.ista.string.proyectofinalpw.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.string.proyectofinalpw.models.dao.IOrdenVentaDao;
import com.ista.string.proyectofinalpw.models.entity.OrdenVenta;

@Service
public class OrdenVentaImp implements IOrdenVentaService{

	@Autowired
	private IOrdenVentaDao ordenDao;
	
	@Override
	@Transactional
	public List<OrdenVenta> findAll() {
		return (List<OrdenVenta>) ordenDao.findAll();
	}

	@Override
	public OrdenVenta save(OrdenVenta orden) {
		return ordenDao.save(orden);
	}

	@Override
	@Transactional
	public OrdenVenta findbyid(Long id) {
		return ordenDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		ordenDao.deleteById(id);
	}

	

}
