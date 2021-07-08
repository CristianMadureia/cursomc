package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.services.exceptions.ObjectNotFoundException;

//Uma classe service fica responsavel por chamar um repsoitory para acessar os dados;
@Service
public class CategoriaService {
	
	@Autowired //Essa anotação faz com que a dependencia abaixo seja automaticamente instanciada;
	private CategoriaRepository repo;
	
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		
			return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objeto não encontrado! ID: " + id + ", Tpo: " + Categoria.class.getName()));
	}
}
