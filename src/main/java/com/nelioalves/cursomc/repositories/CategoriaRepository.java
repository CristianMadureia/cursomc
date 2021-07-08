package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Categoria;
//Camada de acesso a dados;
//Repository indica uma classe que irá acessar o banco de dados e fazer consultas;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
