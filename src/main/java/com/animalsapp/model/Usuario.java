package com.animalsapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usuarios")
@Data
public class Usuario {

    @Id
    @Column(name = "id_Usuario", nullable = false)
    private Long id;

    @Column(name = "nombre_Usuario", nullable = false)
    private String nombreUsuario;

    @Column(name = "correo_electronico", nullable = false)
    private String correoElectronico;

    @Column(name = "password", nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "id_rol", nullable = false)
    private Rol rol;
}
