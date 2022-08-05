package com.gameshop.games.Repository;

import com.gameshop.games.Model.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository <CategoriaModel, Long> {
    public List<CategoriaModel> findAllBynomeCategoriaContainingIgnoreCase(String nomeCategoria);

}
