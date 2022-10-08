package com.djalmasilva.cursomc1.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djalmasilva.cursomc1.domain.Categoria;
import com.djalmasilva.cursomc1.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
//		Categoria obj = repo.findOne(id);
		Optional<Categoria> obj = repo.findById(id);
//		return obj;
		return obj.orElse(null);
	}
}
