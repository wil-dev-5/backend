package com.v93.service;

import java.util.List;

import com.v93.entity.Rol;


public interface IRolService {
	

	public List<Rol> findAll ();
	
	public Rol save(Rol rol);

	public Rol findbyid(Long id);

	public void delete(Long id);
}
