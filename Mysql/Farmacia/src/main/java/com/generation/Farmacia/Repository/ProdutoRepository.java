package com.generation.Farmacia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.Farmacia.Model.ProdutosModel;



public interface ProdutoRepository extends  JpaRepository<ProdutosModel, Long>{
	
	public List<ProdutosModel> findAllByNameContaingIgnoreCase(String name);
}
