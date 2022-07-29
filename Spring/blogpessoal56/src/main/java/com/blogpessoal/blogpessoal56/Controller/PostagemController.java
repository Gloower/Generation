package com.blogpessoal.blogpessoal56.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogpessoal.blogpessoal56.blog.repository.PostagemRepository;
import com.blogpessoal.blogpessoal56.model.Postagem;

@RestController
@RequestMapping("/index")
@CrossOrigin(origins = "*", allowedHeaders = "*" ) /*indica que a classe controladora permitirá o recebimento de
requisições realizadas de fora do domíni */

public class PostagemController {
    
  @Autowired /*, é a implementação utilizada
  pelo Spring Framework para aplicar a Inversão de Controle  */
    private PostagemRepository postagemRepository;

    @GetMapping
    public ResponseEntity<List<Postagem>> getAll(){
        return ResponseEntity.ok(postagemRepository.findAll());
    }
    
}

