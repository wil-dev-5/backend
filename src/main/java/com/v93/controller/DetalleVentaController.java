package com.v93.controller;

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

import com.v93.entity.DetalleVenta;
import com.v93.service.IDetalleVentaService;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class DetalleVentaController {

	@Autowired
	IDetalleVentaService detalleService;
	
	@GetMapping("/detalles")
	public List<DetalleVenta> indext(){
		return detalleService.findAll();			
	}
	
	@GetMapping("/detalles/{id}")
	public DetalleVenta show (@PathVariable Long id) {
		return detalleService.findbyid(id);
	}
	
	@PostMapping("/detalles")
	@ResponseStatus(HttpStatus.CREATED)
	public DetalleVenta create(@RequestBody DetalleVenta detalle) {
		return detalleService.save(detalle);
	}
	
	@PutMapping("/detalles/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public DetalleVenta update(@RequestBody DetalleVenta detalle, @PathVariable Long id) {
		DetalleVenta detalleActual = detalleService.findbyid(id);
		detalleActual.setCantidad(detalle.getCantidad());
		return detalleService.save(detalleActual);
	}
	
	@DeleteMapping("/detalles/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		detalleService.delete(id);
	}
	
}
