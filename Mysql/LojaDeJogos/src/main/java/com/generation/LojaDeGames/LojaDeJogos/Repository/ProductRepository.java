package com.generation.LojaDeGames.LojaDeJogos.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.LojaDeGames.LojaDeJogos.Model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long>{
	
	public List<ProductModel> findAllByNameContainingIgnoreCase(String name);
}
