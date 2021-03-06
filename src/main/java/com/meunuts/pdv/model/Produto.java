package com.meunuts.pdv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Produto {

	@Id
	@GeneratedValue
	private long id;
	
	private String nome;
	private String descricao;

}
