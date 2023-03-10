package com.v93.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.v93.dao.IProductoDao;
import com.v93.entity.Producto;


@Service
public class ProductoServicesImp implements IProductoService{

	
	@Autowired
	private IProductoDao ProductoDao;
	
	
	@Override
	@Transactional
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>)ProductoDao.findAll();
	}

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return ProductoDao.save(producto);
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findbyid(Long id) {
		// TODO Auto-generated method stub

		return ProductoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		ProductoDao.deleteById(id);
	}

}
