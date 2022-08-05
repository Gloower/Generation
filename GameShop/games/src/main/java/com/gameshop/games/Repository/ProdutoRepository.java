package com.gameshop.games.Repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gameshop.games.Model.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{

    public List <ProdutoModel> findAllBynomeProdutoContainingIgnoreCase(String nomeProduto);
    
}
