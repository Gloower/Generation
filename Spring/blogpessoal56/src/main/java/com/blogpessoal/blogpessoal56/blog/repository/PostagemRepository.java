package com.blogpessoal.blogpessoal56.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogpessoal.blogpessoal56.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
    
}
