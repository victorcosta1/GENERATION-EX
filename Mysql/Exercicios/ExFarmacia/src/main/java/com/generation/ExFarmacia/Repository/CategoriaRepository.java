package com.generation.ExFarmacia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.ExFarmacia.Model.CategoriaModel;

@Repository
public interface CategoriaRepository extends JpaRepository <CategoriaModel, Long>{
	public List <CategoriaModel> findAllByEspecificacaoContainingIgnoreCase(String especificacao);
}
