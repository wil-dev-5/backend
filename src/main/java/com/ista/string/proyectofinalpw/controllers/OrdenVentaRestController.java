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

import com.ista.string.proyectofinalpw.models.entity.OrdenVenta;
import com.ista.string.proyectofinalpw.models.service.IOrdenVentaService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class OrdenVentaRestController {

	@Autowired
	private IOrdenVentaService ordenService;
	
	@GetMapping("/ordenes")
	public List<OrdenVenta> indext(){
		return ordenService.findAll();			
	}
	
	@GetMapping("/ordenes/{id}")
	public OrdenVenta show (@PathVariable Long id) {
		return ordenService.findbyid(id);
		
	}
	
	@PostMapping("/ordenes")
	@ResponseStatus(HttpStatus.CREATED)
	public OrdenVenta create(@RequestBody OrdenVenta orden) {
		return ordenService.save(orden);
	}
	
	@PutMapping("/ordenes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public OrdenVenta update(@RequestBody OrdenVenta orden, @PathVariable Long id) {
		OrdenVenta ordenActual = ordenService.findbyid(id);
		ordenActual.setNumero(orden.getNumero());
		ordenActual.setFecha(orden.getFecha());
		ordenActual.setCedula(orden.getCedula());
		ordenActual.setTotal(orden.getTotal());
		return ordenService.save(ordenActual);
	}
	
	@DeleteMapping("/ordenes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		ordenService.delete(id);
	}
}
