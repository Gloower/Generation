package com.blogpessoal.blogpessoal56.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.blogpessoal.blogpessoal56.model.Postagem;
import java.util.*;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
    public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}
