package com.animalsapp.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Roles")
public class Rol {

    @Id
    @Column(name = "RolID")
    private Long id;

    @Column(name = "NombreRol", nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "rol")
    private Set<Usuario> usuarios;

    // Constructor, getters, setters, etc.
}
