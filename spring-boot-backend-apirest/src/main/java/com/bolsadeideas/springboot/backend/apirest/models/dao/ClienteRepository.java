package com.bolsadeideas.springboot.backend.apirest.models.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.ClienteEntidad;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntidad, Long>{
	
}
