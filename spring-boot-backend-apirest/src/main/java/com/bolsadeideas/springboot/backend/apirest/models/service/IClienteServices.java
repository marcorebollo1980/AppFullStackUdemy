package com.bolsadeideas.springboot.backend.apirest.models.service;


import java.util.List;
import com.bolsadeideas.springboot.backend.apirest.models.entity.ClienteEntidad;

public interface IClienteServices {
	
    public List<ClienteEntidad> findAll();
	
	public ClienteEntidad save(ClienteEntidad clienteEntity);
	
	public void saveCliente(ClienteEntidad clienteEntity);
	
	public void delete(Long id);
	
	public boolean existsById(Long id);

}
