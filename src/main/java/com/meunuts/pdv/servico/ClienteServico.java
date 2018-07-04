package com.meunuts.pdv.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meunuts.pdv.model.Cliente;
import com.meunuts.pdv.repositorio.ClienteRepositorio;

@Service
public class ClienteServico {
	
	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	public void salvar(Cliente cliente) {
		clienteRepositorio.save(cliente);
	}
	
	public void remover(long id) {
		clienteRepositorio.delete(id);
	}
	
	public Cliente procurarPorId(long id) {
		return clienteRepositorio.findOne(id);
	}
	
	public List<Cliente> procurarTodos() {
		return clienteRepositorio.findAll();
	}
	

}
