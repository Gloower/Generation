package com.blogpessoal.blogpessoal56.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.blogpessoal.blogpessoal56.model.Temas;
import java.util.*;

@Repository
public interface TemasRepository extends JpaRepository<Temas, Long>{
	public List<Temas> findAllByTemasDescricaoContainingIgnoreCase(@Param("temasDescricao") String temasDescricao);
}
