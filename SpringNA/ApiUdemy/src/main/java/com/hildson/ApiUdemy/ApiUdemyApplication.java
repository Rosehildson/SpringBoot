package com.hildson.ApiUdemy;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.hildson.ApiUdemy.domain.Categoria;
import com.hildson.ApiUdemy.domain.Produto;
import com.hildson.ApiUdemy.repositories.CategoriaRepository;
import com.hildson.ApiUdemy.repositories.ProdutoRepository;

@RestController
@SpringBootApplication
public class ApiUdemyApplication implements CommandLineRunner{

/* == INICIO --- DEPENDÊNCIA COM O ENDPOINT == */
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;

/* == FIM --- DEPENDÊNCIA COM O ENDPOINT == */
	public static void main(String[] args) {
		SpringApplication.run(ApiUdemyApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
/* == INICIO --- INSTANCIAÇÃO DOS OBJETOS NO ENDPOINT == */
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);

/* == FIM --- INSTANCIAÇÃO DOS OBJETOS NO ENDPOINT == */
/* == INICIO --- ASSOCIAÇÃO DOS OBJETOS NO ENDPOINT == */
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));		
		
		
/* == FIM --- ASSOCIAÇÃO DOS OBJETOS NO ENDPOINT == */
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		
	}

	
/*
	@GetMapping("/udemy")
	public String index(){
		return ("Olá mundo!");
	}
*/
	
}