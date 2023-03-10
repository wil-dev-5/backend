package com.v93.dao;

import org.springframework.data.repository.CrudRepository;

import com.v93.entity.Producto;


public interface IProductoDao extends CrudRepository<Producto,Long>{

}
