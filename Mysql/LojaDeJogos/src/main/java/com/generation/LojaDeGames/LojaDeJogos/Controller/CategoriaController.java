package com.generation.LojaDeGames.LojaDeJogos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.LojaDeGames.LojaDeJogos.Model.CategoriaModel;
import com.generation.LojaDeGames.LojaDeJogos.Repository.CategoriaRepository;

@RestController
@RequestMapping ("/categoria") 
@CrossOrigin(origins="*", allowedHeaders = "*")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<CategoriaModel>>GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	
	//Metodo get
	@GetMapping("/{id}")
	public ResponseEntity<CategoriaModel>GetById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/genero/{genero}")
	public ResponseEntity<List<CategoriaModel>>GetByGenero(@PathVariable String genero){
		return ResponseEntity.ok(repository.findAllByDescriptionContainingIgnoreCase(genero));
	}
	
	//POST
	
	@PostMapping
	public ResponseEntity<CategoriaModel>Post(@RequestBody CategoriaModel categoria){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(categoria));
	}
	
	
	//PUT
	
	@PutMapping
	public ResponseEntity<CategoriaModel>Pust(@RequestBody CategoriaModel categoria){
		return ResponseEntity.ok(repository.save(categoria));
	}
	
	
	//delete
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
