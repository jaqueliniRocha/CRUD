package com.meunuts.pdv.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.meunuts.pdv.model.Cliente;


public interface ClienteRepositorio extends CrudRepository<Cliente, Long> {
	
}
