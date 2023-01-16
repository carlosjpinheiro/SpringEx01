package com.example.exercicio1.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exercicio1.repositories.CategoriaRepository;
import com.example.exercicio1.entities.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {

	@Autowired
	public CategoriaRepository categoriaRepository;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAll(){
		List<Categoria> list = categoriaRepository.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Long id){
		//Categoria categoria = categoriaRepository.findById(id).get();
		return ResponseEntity.ok().body(categoriaRepository.findById(id).get());
	}
	
}
