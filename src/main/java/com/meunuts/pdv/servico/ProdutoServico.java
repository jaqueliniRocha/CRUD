package com.meunuts.pdv.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meunuts.pdv.model.Produto;
import com.meunuts.pdv.repositorio.ProdutoRepositorio;

@Service
public class ProdutoServico {

	@Autowired
	private ProdutoRepositorio produtoRepositorio;
	
	
	public void salvar(Produto produto) {
		produtoRepositorio.save(produto);
	}
	
	public void remover(long id) {
		produtoRepositorio.delete(id);
	}
	
	public Produto procurarPorId(long id) {
		return produtoRepositorio.findOne(id);
	}
	
	public List<Produto> procurarTodos() {
		return produtoRepositorio.findAll();
	}
}
