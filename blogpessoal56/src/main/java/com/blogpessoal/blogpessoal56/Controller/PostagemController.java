package com.blogpessoal.blogpessoal56.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.blogpessoal.blogpessoal56.blog.repository.PostagemRepository;
import com.blogpessoal.blogpessoal56.model.Postagem;

@RestController
@RequestMapping("/postagem")
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
    
    @GetMapping("/{id}")
    public ResponseEntity<Postagem> getById(@PathVariable Long id){
      return postagemRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta)).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @GetMapping("/titulo/{titulo}")
    public ResponseEntity<List<Postagem>> getByTitulo(@PathVariable String titulo){
      return ResponseEntity.ok(postagemRepository.findAllByTituloContainingIgnoreCase(titulo));
    }

    @PostMapping 
    public ResponseEntity<Postagem> post(@Valid @RequestBody Postagem postagem){
      return ResponseEntity.status(HttpStatus.CREATED).body(postagemRepository.save(postagem));
    }

    @PutMapping
    public ResponseEntity<@Valid Postagem> put(@Valid @RequestBody Postagem postagem){
      return postagemRepository.findById(postagem.getId()).map(resposta -> ResponseEntity.status(HttpStatus.OK).body(postagemRepository.save(postagem))).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
      Optional<Postagem> postagem = postagemRepository.findById(id);
          if(postagem.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

          postagemRepository.deleteById(id);
    }
}

