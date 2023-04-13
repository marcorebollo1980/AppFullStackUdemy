package com.bolsadeideas.springboot.backend.apirest.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.backend.apirest.models.entity.ClienteEntidad;
import com.bolsadeideas.springboot.backend.apirest.models.service.IClienteServices;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api")
public class ClienteController {
	
	@Autowired
	private IClienteServices clienteService;
	
	@GetMapping("/info")
	public String getInfo() {
		String message = "Prueba exitosa!!";
		return message;
	}

	@GetMapping("/clientes")
	public ResponseEntity<List<ClienteEntidad>> findAllClients() {
		List<ClienteEntidad> clienteRepositories = clienteService.findAll();
		return new ResponseEntity<>(clienteRepositories, HttpStatus.OK);
	}
	
	@PostMapping("/clientes")
	public ResponseEntity<ClienteEntidad> create(@Valid @RequestBody ClienteEntidad clienteEntidad){
		if(clienteService.existsById(clienteEntidad.getId())) {
			ClienteEntidad cliente = clienteService.save(clienteEntidad);
			return new ResponseEntity<ClienteEntidad>(cliente, HttpStatus.CREATED);
		}else {
			return new ResponseEntity<ClienteEntidad>(HttpStatus.CONFLICT);
		}
		
	}
	

}
