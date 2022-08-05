package com.gameshop.games.Controller;


import com.gameshop.games.Model.CategoriaModel;
import com.gameshop.games.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public ResponseEntity<List<CategoriaModel>> getAll(){
        return ResponseEntity.ok(categoriaRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaModel> getById(@PathVariable Long id){
        return categoriaRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta)).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @GetMapping("/categorias/{categoria}")
    public ResponseEntity<List<CategoriaModel>> getBynomeCategoria(@PathVariable String nomeCategoria){
        return ResponseEntity.ok(categoriaRepository.findAllBynomeCategoriaContainingIgnoreCase(nomeCategoria));
    }

    @PostMapping
    public ResponseEntity<CategoriaModel> post(@Valid @RequestBody CategoriaModel categoria){
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaRepository.save(categoria));
    }

    @PutMapping
    public ResponseEntity<CategoriaModel> put(@Valid @RequestBody CategoriaModel categoria){
        return categoriaRepository.findById(categoria.getId()).map(resposta -> ResponseEntity.status(HttpStatus.OK).body(categoriaRepository.save(categoria))).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        Optional<CategoriaModel> categoria = categoriaRepository.findById(id);
        if(categoria.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        categoriaRepository.deleteById(id);
    }
}
