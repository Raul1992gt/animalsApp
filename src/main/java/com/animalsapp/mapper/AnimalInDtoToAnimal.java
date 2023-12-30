package com.animalsapp.mapper;

import com.animalsapp.model.Animal;
import com.animalsapp.model.Usuario;
import com.animalsapp.service.DTO.AnimalInDto;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class AnimalInDtoToAnimal implements IMapper<AnimalInDto, Animal> {
    @Override
    public Animal map(AnimalInDto i) {
        Animal animal = new Animal();

        animal.setNombreAnimal(i.getNombreAnimal());
        animal.setTipoAnimal(i.getTipoAnimal());
        animal.setUbicacion(i.getUbicacion());
        animal.setDescripcion(i.getDescripcion());

        animal.setFechaCreacion(new Date());

        return animal;
    }
}
