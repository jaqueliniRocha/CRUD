package com.meunuts.pdv.resource;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.meunuts.pdv.model.Produto;

@Component
@Path("/produto")
public class ProdutoResource {
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Produto criar(Produto produto) {
		return produto;
	}
	
	@GET
	public String procurarTodos() {
		return "Hello procurarTodos!";
	}
	
	@GET
	@Path("/{id}")
	public String procurarPorId(@PathParam("id") String id) {
		return "Hello World com " + id;
	}
	
	@DELETE
	public String deletar() {
		return "Hello deletar!";
	}
	
	@PUT
	public String atualizar() {
		return "Hello atualizar!";
	}
}
