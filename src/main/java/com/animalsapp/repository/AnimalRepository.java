package com.animalsapp.repository;

import com.animalsapp.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
    Animal findByNombreAnimal(String nombreAnimal);

    Animal findByUbicacion(String ubicacion);

    Animal findByTipoAnimal(String tipoAnimal);


    Animal findByUbicacionAndTipoAnimal(String ubicacion, String tipoAnimal);
}
