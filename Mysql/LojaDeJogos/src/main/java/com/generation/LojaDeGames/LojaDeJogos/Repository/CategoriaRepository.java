package com.generation.LojaDeGames.LojaDeJogos.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.LojaDeGames.LojaDeJogos.Model.CategoriaModel;


public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{
	public List<CategoriaModel>findAllByDescriptionContainingIgnoreCase(String description);
}
