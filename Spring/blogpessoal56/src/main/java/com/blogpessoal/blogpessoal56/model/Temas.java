package com.blogpessoal.blogpessoal56.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

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
    private String temasDescrição;

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

    public String getTemasDescrição() {
        return temasDescrição;
    }

    public void setTemasDescrição(String temasDescrição) {
        this.temasDescrição = temasDescrição;
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