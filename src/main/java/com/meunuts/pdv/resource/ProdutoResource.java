package com.meunuts.pdv.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.meunuts.pdv.model.Produto;
import com.meunuts.pdv.servico.ProdutoServico;

@CrossOrigin
@Component
@Path("/produto")
public class ProdutoResource {
	
	
	@Autowired
	private ProdutoServico produtoServico;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response criar(Produto produto) {
		produtoServico.salvar(produto);
		return Response.ok().build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response procurarTodos() {
		List<Produto> todosProdutos = produtoServico.procurarTodos();
		return Response.ok(todosProdutos).build();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response procurarPorId(@PathParam("id") long id) {
		return Response.ok(produtoServico.procurarPorId(id)).build();
	}
	
	@DELETE
	@Path("/{id}")
	public Response deletar(@PathParam("id") long id) {
		produtoServico.remover(id);
		return Response.ok().build();
	}
	
	@POST
	@Path("/{id}")
	public Response atualizar(@PathParam("id") long id, Produto produtoAtualizado) {
		Produto procurarPorId = produtoServico.procurarPorId(id);
		if(procurarPorId == null) {
			return Response.status(404).build();
		}
		produtoAtualizado.setId(id);
		produtoServico.salvar(produtoAtualizado);
		return Response.ok().build();
	}
}
