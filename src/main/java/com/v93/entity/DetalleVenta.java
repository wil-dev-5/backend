package com.v93.entity;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "detalles")
public class DetalleVenta implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length=20)
	private Long cantidad;
	
	@ManyToOne
    @JoinColumn(name = "orden_id", referencedColumnName = "id")
	private OrdenVenta orden;
	
	@ManyToOne
    @JoinColumn(name = "producto_id", referencedColumnName = "id")
	private Producto producto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	public OrdenVenta getOrden() {
		return orden;
	}

	public void setOrden(OrdenVenta orden) {
		this.orden = orden;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
}
