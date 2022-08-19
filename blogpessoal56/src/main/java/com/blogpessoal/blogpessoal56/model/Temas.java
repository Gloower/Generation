package com.blogpessoal.blogpessoal56.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "TB_TEMAS")
public class Temas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank // Famoso NOT NULL --> porem mais completo
    @Size(min = 3, max = 255) // minimo tem que ser --> 3 e o maximo --> 255
    private String temasNome;

    @NotBlank // Famoso NOT NULL --> porem mais completo
    @Size(min = 5, max = 1000) // minimo tem que ser --> 5 e o maximo --> 1000
    private String temasDescricao;

    @OneToMany(mappedBy = "tema", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("tema")
    private List<Postagem> postagem;

    public List<Postagem> getPostagem() {
        return postagem;
    }

    public void setPostagem(List<Postagem> postagem) {
        this.postagem = postagem;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTemasNome() {
        return temasNome;
    }

    public void setTemasNome(String temasNome) {
        this.temasNome = temasNome;
    }

    public String getTemasDescricao() {
        return temasDescricao;
    }

    public void setTemasDescrição(String temasDescricao) {
        this.temasDescricao = temasDescricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @UpdateTimestamp
    private LocalDateTime data;     

}