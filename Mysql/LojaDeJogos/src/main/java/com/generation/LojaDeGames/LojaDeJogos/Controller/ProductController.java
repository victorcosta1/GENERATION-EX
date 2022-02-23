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

import com.generation.LojaDeGames.LojaDeJogos.Model.ProductModel;
import com.generation.LojaDeGames.LojaDeJogos.Repository.ProductRepository;



@RestController
@RequestMapping ("/produto") 
@CrossOrigin(origins="*", allowedHeaders = "*")
public class ProductController {
	
	@Autowired
	private ProductRepository repository;
	
	@GetMapping
	public ResponseEntity<List<ProductModel>>GetAll(){
		return ResponseEntity.ok(repository.findAll());	
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProductModel>GetById(@PathVariable long id){
		return repository.findById(id).map(resp-> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/name/{name}")
		public ResponseEntity<List<ProductModel>>GetByName(@PathVariable String name){
			return ResponseEntity.ok(repository.findAllByNameContainingIgnoreCase(name));
		}
	
	@PostMapping
	public ResponseEntity<ProductModel>Post(@RequestBody ProductModel product){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(product));
	}
	
	
	@PutMapping
	public ResponseEntity<ProductModel>Put(@RequestBody ProductModel product){
		return ResponseEntity.ok(repository.save(product));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
	}

