package com.gameshop.games.Model;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;


@Entity
@Table(name ="TB_CATEGORIA")
public class CategoriaModel {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 5, max = 255)
    private String nomeCategoria;

    @NotBlank
    @Size(min = 5, max = 255)
    private String descricaoCategoria;

    @UpdateTimestamp
    private LocalDateTime data;


}
