package com.blogpessoal.blogpessoal56.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "TB_POSTAGENS")
public class Postagem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank // Famoso NOT NULL --> porem mais completo
    @Size(min = 3, max = 255) // minimo tem que ser --> 3 e o maximo --> 255
    private String titulo;

    @NotBlank // Famoso NOT NULL --> porem mais completo
    @Size(min = 5, max = 1000) // minimo tem que ser --> 5 e o maximo --> 1000
    private String texto;

    @UpdateTimestamp
    private LocalDateTime data;

    @ManyToOne
    @JsonIgnoreProperties("postagem")
    private Usuario usuario;
    @ManyToOne
    @JsonIgnoreProperties("postagem")
    private Temas tema;

    public Temas getTema() {
        return tema;
    }
    public void setTema(Temas tema) {
        this.tema = tema;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}