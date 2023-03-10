package com.v93.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.v93.dao.IRolDao;
import com.v93.entity.Rol;


@Service
public class RolServicesImp implements IRolService{

	@Autowired
	private IRolDao rolDao;

	@Override
	@Transactional
	public List<Rol> findAll() {
		// TODO Auto-generated method stub
		return (List<Rol>)rolDao.findAll();
	}

	@Override
	public Rol save(Rol rol) {
		// TODO Auto-generated method stub
		return rolDao.save(rol);
	}

	@Override
	@Transactional(readOnly = true)
	public Rol findbyid(Long id) {
		// TODO Auto-generated method stub
		return rolDao.findById(id).orElse(null);
	}

	@Override
	@Transactional	
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rolDao.deleteById(id);
		
	}
	
	

}
