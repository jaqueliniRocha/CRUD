package com.meunuts.pdv.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meunuts.pdv.model.Produto;

public interface ProdutoRepositorio  extends JpaRepository<Produto, Long>{

}
