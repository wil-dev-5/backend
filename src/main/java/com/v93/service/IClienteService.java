package com.v93.service;

import java.util.List;

import com.v93.entity.Cliente;


public interface IClienteService {

	public List<Cliente> findAll ();
	
	public Cliente save(Cliente cliente);

	public Cliente findbyid(Long id);

	public void delete(Long id);

}
