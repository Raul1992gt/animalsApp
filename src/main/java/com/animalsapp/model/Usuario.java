package com.animalsapp.model;

import com.animalsapp.model.animal.Animal;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Usuarios")
public class Usuario {

    @Id
    @Column(name = "UsuarioID")
    private Long id;

    @Column(name = "NombreUsuario", nullable = false)
    private String nombreUsuario;

    @Column(name = "CorreoElectronico", nullable = false)
    private String correoElectronico;

    @Column(name = "Contraseña", nullable = false)
    private String contraseña;

    @ManyToOne
    @JoinColumn(name = "RolID", nullable = false)
    private Rol rol;

    @OneToMany(mappedBy = "usuario")
    private Set<Comentario> comentarios;

    @OneToMany(mappedBy = "usuario")
    private Set<Animal> animales;

    // Constructor, getters, setters, etc.
}
