package com.v93.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.v93.dao.ICategoriaDao;
import com.v93.entity.Categoria;


@Service
public class CategoriaServicesImp implements ICategoriaService{

	@Autowired
	private ICategoriaDao categoriaDao;

	@Override
	@Transactional
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return (List<Categoria>)categoriaDao.findAll();
	}

	@Override
	public Categoria save(Categoria categoria) {
		// TODO Auto-generated method stub
		return categoriaDao.save(categoria);
	}

	@Override
	@Transactional(readOnly = true)
	public Categoria findbyid(Long id) {
		// TODO Auto-generated method stub
		return categoriaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional	
	public void delete(Long id) {
		// TODO Auto-generated method stub
		categoriaDao.deleteById(id);
		
	}
	

}
