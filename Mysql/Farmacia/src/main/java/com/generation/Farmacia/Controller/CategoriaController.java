package com.generation.Farmacia.Controller;

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

import com.generation.Farmacia.Model.CategoriaModel;
import com.generation.Farmacia.Repository.CategoriaRepository;

//FARMACIA!!! NÃO CONFUNDE BURRO


@RestController
@RequestMapping ("/category")  //END-POINT
@CrossOrigin(origins="*", allowedHeaders="*")
public class CategoriaController {
	
	
	@Autowired
	private CategoriaRepository repository;
	
	
	@GetMapping("{/id}") //Nome da classe Tem que importar!!
	public ResponseEntity<List<CategoriaModel>>GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id")
	public ResponseEntity<CategoriaModel>GetById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/classe/{classe}")
	public ResponseEntity<List<CategoriaModel>>GetByGenero(@PathVariable String classe){
		return ResponseEntity.ok(repository.findAllByDescriptionContainingIgnoreCase(classe));
	}
	
	@PostMapping
	public ResponseEntity<CategoriaModel>Post(@RequestBody CategoriaModel categoria){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(repository.save(categoria));
	}
	
	//-------------------------------------------//
	
	//put
	
	@PutMapping
	public ResponseEntity<CategoriaModel>Put(@RequestBody CategoriaModel categoria){
		return ResponseEntity.ok(repository.save(categoria));
	}
	
	//------------------------------------------------------//
	
	
	//Delete
	
	@DeleteMapping("/{id}")
		public void delete(@PathVariable long id) {
			repository.deleteById(id);
	}
	
}
