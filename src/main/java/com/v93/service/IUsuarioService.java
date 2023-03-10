package com.v93.service;

import java.util.List;

import com.v93.entity.Usuario;


public interface IUsuarioService {
	

	public List<Usuario> findAll ();
	
	public Usuario save(Usuario usuario);

	public Usuario findbyid(Long id);

	public void delete(Long id);
}
