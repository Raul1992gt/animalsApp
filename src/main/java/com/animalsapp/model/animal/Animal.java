package com.animalsapp.model.animal;

import com.animalsapp.model.Comentario;
import com.animalsapp.model.Usuario;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Animales")
public class Animal {

    @Id
    @Column(name = "AnimalID")
    private Long id;

    @Column(name = "NombreAnimal", nullable = false)
    private String nombreAnimal;

    @Column(name = "TipoAnimal", nullable = false)
    private String tipoAnimal;

    @Column(name = "Descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "Ubicacion", length = 100)
    private String ubicacion;

    @ManyToOne
    @JoinColumn(name = "UsuarioID")
    private Usuario usuario;

    @OneToMany(mappedBy = "animal")
    private Set<Comentario> comentarios;

    // Constructor, getters, setters, etc.
}
