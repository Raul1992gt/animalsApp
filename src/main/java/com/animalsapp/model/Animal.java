package com.animalsapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "animales")
@Data
public class Animal {

    @Id
    @Column(name = "id_animal")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "animal_id_seq")
    @SequenceGenerator(name = "animal_id_seq", sequenceName = "animal_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "nombre_animal", nullable = false)
    private String nombreAnimal;

    @Column(name = "tipo_animal", nullable = false)
    private String tipoAnimal;

    @Column(name = "descripcion", length = 255)
    private String descripcion;

    @Column(name = "ubicacion", length = 255)
    private String ubicacion;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    public Animal() {
    }

    public Animal(Long id, String nombreAnimal, String tipoAnimal, String descripcion, String ubicacion, Date fechaCreacion ) {
        this.id = id;
        this.nombreAnimal = nombreAnimal;
        this.tipoAnimal = tipoAnimal;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.fechaCreacion = fechaCreacion;
    }
}
