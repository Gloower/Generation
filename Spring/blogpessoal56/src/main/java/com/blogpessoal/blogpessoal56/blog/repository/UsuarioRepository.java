package com.blogpessoal.blogpessoal56.blog.repository;

import com.blogpessoal.blogpessoal56.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public Optional<Usuario> findByUsuario(String usuario);
    public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
}