package com.hildson.ApiUdemy;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.hildson.ApiUdemy.domain.Categoria;
import com.hildson.ApiUdemy.repositories.CategoriaRepository;

@RestController
@SpringBootApplication
public class ApiUdemyApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiUdemyApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	}

	
	
	
/*
	@GetMapping("/udemy")
	public String index(){
		return ("Olá mundo!");
	}
*/
	
}