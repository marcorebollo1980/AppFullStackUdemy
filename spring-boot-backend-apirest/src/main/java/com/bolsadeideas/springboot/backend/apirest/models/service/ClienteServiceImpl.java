package com.bolsadeideas.springboot.backend.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.backend.apirest.models.dao.ClienteRepository;
import com.bolsadeideas.springboot.backend.apirest.models.entity.ClienteEntidad;

@Service
public class ClienteServiceImpl implements IClienteServices{
	
	@Autowired
	private ClienteRepository clienteRepository;


	@Override
	public List<ClienteEntidad> findAll() {
		return clienteRepository.findAll();
	}

	@Override
	public ClienteEntidad save(ClienteEntidad clienteEntity) {
		return clienteRepository.save(clienteEntity);
	}

	@Override
	public void delete(Long id) {
		clienteRepository.deleteById(id);
	}

	@Override
	public boolean existsById(Long id) {
		return clienteRepository.existsById(id);
	}


	@Override
	public void saveCliente(ClienteEntidad clienteEntity) {
		clienteRepository.save(clienteEntity);
	}


}
