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

import com.blogpessoal.blogpessoal56.blog.repository.TemasRepository;
import com.blogpessoal.blogpessoal56.model.Temas;

@RestController
@RequestMapping("/tema")
@CrossOrigin(origins = "*", allowedHeaders = "*") /*indica que a classe controladora permitirá o recebimento de
requisições realizadas de fora do domíni */

public class TemasController {
    @Autowired
    private TemasRepository temaRepository;

    @GetMapping
    public ResponseEntity<List<Temas>> getAll(){
        return ResponseEntity.ok(temaRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Temas> getById(@PathVariable Long id){
      return temaRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta)).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @GetMapping("/temas/{descricao}")
    public ResponseEntity<List<Temas>> getByDescricao(@PathVariable String descricao){
      return ResponseEntity.ok(temaRepository.findAllByTituloContainingIgnoreCase(descricao));
    }

    @PostMapping 
    public ResponseEntity<Temas> post(@Valid @RequestBody Temas tema){
      return ResponseEntity.status(HttpStatus.CREATED).body(temaRepository.save(tema));
    }

    @PutMapping
    public ResponseEntity<@Valid Temas> put(@Valid @RequestBody Temas tema){
      return temaRepository.findById(tema.getId()).map(resposta -> ResponseEntity.status(HttpStatus.OK).body(temaRepository.save(tema))).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());   

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
      Optional<Temas> postagem = temaRepository.findById(id);
          if(postagem.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

          temaRepository.deleteById(id);
    }
}
