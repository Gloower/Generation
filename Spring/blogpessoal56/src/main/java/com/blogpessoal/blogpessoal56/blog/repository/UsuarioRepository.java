package com.blogpessoal.blogpessoal56.blog.repository;

import com.blogpessoal.blogpessoal56.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario,Long>  {
}
