package com.farmacia.farmacinha.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmacia.farmacinha.Model.Produtos;
import com.farmacia.farmacinha.repository.ProdutosRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/produtos")
public class ProdutosController {
    
@Autowired
private ProdutosRepository produtosRepository;

@GetMapping
public ResponseEntity<List<Produtos>> getAll(){
    return ResponseEntity.ok(produtosRepository.findAll());
}

@GetMapping("/{id}")
public ResponseEntity<Produtos> getById(@PathVariable long id){
    return produtosRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta)).orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
}

@GetMapping("/produto/{produtoNome}")
public ResponseEntity<List<Produtos>> getByprodutoNome(@PathVariable String produtoNome){
    return ResponseEntity.ok(produtosRepository.findAllByprodutoNomeContainingIgnoreCase(produtoNome));
}

@PostMapping
public ResponseEntity<Produtos> post(@Valid @RequestBody Produtos produtos){
    return ResponseEntity.status(HttpStatus.CREATED).body(produtosRepository.save(produtos));
}



}
    

