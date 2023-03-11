package com.v93.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name="usuarios")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=60)
	private String correo;
	@Column(length=40)
	private String clave;
	
	@OneToOne(mappedBy = "usuario", fetch = FetchType.LAZY)
    private Cliente cliente;
	
	@OneToOne
    @JoinColumn(name = "rol_id", referencedColumnName = "id")
	private Rol rol;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Producto> produtos;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}	
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
}
