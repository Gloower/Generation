package com.farmacia.farmacinha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.farmacia.farmacinha.Model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

    public List <Categoria> findAllBynomeCategoriaContainingIgnoreCase(@Param("nomesCategoria") String nomesCategoria);

    
}
