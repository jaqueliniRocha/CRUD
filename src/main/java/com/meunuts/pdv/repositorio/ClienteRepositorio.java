package com.meunuts.pdv.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meunuts.pdv.model.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
	
}
