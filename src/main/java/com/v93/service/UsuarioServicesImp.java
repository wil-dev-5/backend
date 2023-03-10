package com.v93.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.v93.dao.IUsuarioDao;
import com.v93.entity.Usuario;


@Service
public class UsuarioServicesImp implements IUsuarioService{

	@Autowired
	private IUsuarioDao UsuarioDao;

	@Override
	@Transactional
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>)UsuarioDao.findAll();
	}

	@Override
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return UsuarioDao.save(usuario);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findbyid(Long id) {
		// TODO Auto-generated method stub
		return UsuarioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional	
	public void delete(Long id) {
		// TODO Auto-generated method stub
		UsuarioDao.deleteById(id);
		
	}
	

}
