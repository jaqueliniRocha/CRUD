package com.meunuts.pdv.servico;

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
	
	public void remover(String id) {
		// TODO Auto-generated method stub
	}
	
	public void procurarPorId(String id) {
		// TODO Auto-generated method stub
	}
	
	public void procurarTodos() {
		// TODO Auto-generated method stub
	}
	

}
