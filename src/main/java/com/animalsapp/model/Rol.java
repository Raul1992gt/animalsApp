package com.animalsapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "roles")
@Data
public class Rol {

    @Id
    @Column(name = "id_rol")
    private Long id;

    @Column(name = "rol", nullable = false)
    private String nombre;

}
