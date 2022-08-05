package com.gameshop.games.Controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.gameshop.games.Model.ProdutoModel;
import com.gameshop.games.Repository.ProdutoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public ResponseEntity<List<ProdutoModel>> getAll(){
        return ResponseEntity.ok(produtoRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoModel> getById(@PathVariable Long id){
        return produtoRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta)).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @GetMapping("/produtos/{produto}")
    public ResponseEntity<List<ProdutoModel>> getBynomeProduto(@PathVariable String nomeProduto){
        return ResponseEntity.ok(produtoRepository.findAllBynomeProdutoContainingIgnoreCase(nomeProduto));
    }

    @PostMapping
    public ResponseEntity<ProdutoModel> post(@Valid @RequestBody ProdutoModel produto){
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
    
    }

    @PutMapping
    public ResponseEntity<ProdutoModel> put(@Valid @RequestBody ProdutoModel produto){
        return produtoRepository.findById(produto.getId()).map(resposta -> ResponseEntity.status(HttpStatus.OK).body(produtoRepository.save(produto))).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
    
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        Optional<ProdutoModel> produto = produtoRepository.findById(id);
        if(produto.isEmpty()) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        produtoRepository.deleteById(id);
    }
}
