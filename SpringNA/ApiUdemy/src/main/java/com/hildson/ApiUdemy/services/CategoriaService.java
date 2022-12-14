package com.hildson.ApiUdemy.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hildson.ApiUdemy.domain.Categoria;
import com.hildson.ApiUdemy.repositories.CategoriaRepository;

@Service
public class CategoriaService {

		@Autowired
		private CategoriaRepository repo;
	
		public Categoria buscar(Integer id) {
			Optional<Categoria> obj = repo.findById(id);
			return obj.orElse(null);
		}
}
