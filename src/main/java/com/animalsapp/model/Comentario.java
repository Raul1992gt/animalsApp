package com.animalsapp.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Comentarios")
public class Comentario {

    @Id
    @Column(name = "ComentarioID")
    private Long id;

    @Column(name = "Contenido", nullable = false, columnDefinition = "TEXT")
    private String contenido;

    @ManyToOne
    @JoinColumn(name = "UsuarioID")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "AnimalID")
    private com.animalsapp.model.Animal animal;

    // Constructor, getters, setters, etc.
}
