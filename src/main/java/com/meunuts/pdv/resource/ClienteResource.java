package com.meunuts.pdv.resource;

import java.util.List;

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

import com.meunuts.pdv.model.Cliente;
import com.meunuts.pdv.servico.ClienteServico;

@Component
@Path("/cliente")
public class ClienteResource {

	@Autowired
	private ClienteServico clienteServico;

	@POST
	public Response criar(Cliente cliente) {
		clienteServico.salvar(cliente);
		return Response.ok().build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response procurarTodos() {
		List<Cliente> todosClientes = clienteServico.procurarTodos();
		return Response.ok(todosClientes).build();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response procurarPorId(@PathParam("id") long id) {
		return Response.ok(clienteServico.procurarPorId(id)).build();
	}

	@DELETE
	@Path("/{id}")
	public Response deletar(@PathParam("id") long id) {
		clienteServico.remover(id);
		return Response.ok().build();
	}

	@PUT
	@Path("/{id}")
	public Response atualizar(@PathParam("id") long id, Cliente clienteAtualizado) {
		Cliente procurarPorId = clienteServico.procurarPorId(id);
		if(procurarPorId == null) {
			return Response.status(404).build();
		}
		clienteAtualizado.setId(id);
		clienteServico.salvar(clienteAtualizado);
		return Response.ok().build();
	}
}
