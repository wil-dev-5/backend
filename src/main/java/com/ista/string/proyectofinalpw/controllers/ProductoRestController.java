package com.ista.string.proyectofinalpw.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.ista.string.proyectofinalpw.models.entity.Producto;
import com.ista.string.proyectofinalpw.models.service.IProductoService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ProductoRestController {
	@Autowired 
	private IProductoService productoService;
	
	@GetMapping("/productos")
	public List<Producto> indext(){
		return productoService.findAll();
				
	}
	@GetMapping("/productos/{id}")
	public Producto show (@PathVariable Long id) {
		return productoService.findbyid(id);
		
	}
	
	
	@PostMapping("/productos")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto create(@RequestBody Producto producto) {
		return productoService.save(producto);
	}
	
	@PutMapping("/productos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto update(@RequestBody Producto producto, @PathVariable Long id) {
		Producto ProductoActual = productoService.findbyid(id);
		ProductoActual.setId(producto.getId());
		ProductoActual.setNombre(producto.getNombre());
		ProductoActual.setDescripcion(producto.getDescripcion());
		ProductoActual.setCategoria(producto.getCategoria());
		ProductoActual.setStock(producto.getStock());
		ProductoActual.setPrecio(producto.getPrecio());
		ProductoActual.setFoto(producto.getFoto());
		
		return productoService.save(ProductoActual);
	}
	
	@DeleteMapping("/productos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		productoService.delete(id);
	}	
	

}
