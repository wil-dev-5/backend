package com.v93.service;

import java.util.List;

import com.v93.entity.Categoria;


public interface ICategoriaService {
	

	public List<Categoria> findAll ();
	
	public Categoria save(Categoria categoria);

	public Categoria findbyid(Long id);

	public void delete(Long id);
}
