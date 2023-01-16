package com.example.exercicio1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.exercicio1.repositories.CategoriaRepository;
import com.example.exercicio1.repositories.GameRepository;
import com.example.exercicio1.entities.*;

@SpringBootApplication
public class Exercicio1Application implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private GameRepository gameRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Exercicio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categoria c1 = new Categoria(null, "Plataforma");
		Categoria c2 = new Categoria(null, "Luta");
		Categoria c3 = new Categoria(null, "Estratégia");
		
		Game g1 = new Game(null, "Donkey Kong Country", "Super Nintendo", 1994, c1);
		Game g2 = new Game(null, "Super Mario World", "Super Nintendo", 1990, c1);
		Game g3 = new Game(null, "Contra III: The Alien Wars", "Super Nintendo", 1992, c1);
		Game g4 = new Game(null, "Mortal Kombat III", "Super Nintendo", 1995, c2);
		Game g5 = new Game(null, "Street Fighter II", "Arcade", 1991, c2);
		Game g6 = new Game(null, "Killer Instict", "Arcade", 1994, c2);
		Game g7 = new Game(null, "Age of Empires II: The Age of Kings", "Microsoft Windows", 1999, c3);
		Game g8 = new Game(null, "RollerCoaster Tycoon", "Microsoft Windows", 1994, c3);
		
		c1.getGames().addAll(Arrays.asList(g1,g2,g3));
		c2.getGames().addAll(Arrays.asList(g4,g5,g6));
		c3.getGames().addAll(Arrays.asList(g7,g8));
		
		categoriaRepository.save(c1);
		categoriaRepository.save(c2);
		categoriaRepository.save(c3);
		
		gameRepository.save(g1);
		gameRepository.save(g2);
		gameRepository.save(g3);
		gameRepository.save(g4);
		gameRepository.save(g5);
		gameRepository.save(g6);
		gameRepository.save(g7);
		gameRepository.save(g8);
		
		
		
		
		
		
	}

}
