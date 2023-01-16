package com.example.exercicio1.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exercicio1.repositories.GameRepository;
import com.example.exercicio1.entities.Game;

@RestController
@RequestMapping(value = "/games")
public class GameResources {

	@Autowired
	public GameRepository gameRepository;
	
	@GetMapping
	public ResponseEntity<List<Game>> findAll(){
		List<Game> list = gameRepository.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Game> findById(@PathVariable Long id){
		return ResponseEntity.ok().body(gameRepository.findById(id).get());
	}
}
