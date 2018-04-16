package com.meunuts.pdv.model;

import lombok.Data;

@Data
public class Cliente {

	private String id;
	private String nome;
	private String cpf;
	private String endereco;
	private String celular;
	private String email;

}
