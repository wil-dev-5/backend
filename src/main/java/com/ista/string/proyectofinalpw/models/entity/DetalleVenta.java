package com.ista.string.proyectofinalpw.models.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalles")
public class DetalleVenta {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	private Long cantidad;
	private Double precio;
	
	@JoinColumn
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private OrdenVenta orden;
	
	@JoinColumn
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Producto producto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	
}
