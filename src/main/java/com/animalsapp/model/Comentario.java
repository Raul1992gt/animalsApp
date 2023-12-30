package com.animalsapp.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "comentarios")
@Data
public class Comentario {

    @Id
    @Column(name = "id_comentario")
    private Long id;

    @Column(name = "contenido", nullable = false, length = 255)
    private String contenido;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_animal")
    private Animal animal;

}
