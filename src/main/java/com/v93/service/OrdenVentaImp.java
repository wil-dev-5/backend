package com.v93.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.v93.dao.IOrdenVentaDao;
import com.v93.entity.OrdenVenta;


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
