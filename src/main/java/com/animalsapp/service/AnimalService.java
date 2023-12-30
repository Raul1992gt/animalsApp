package com.animalsapp.service;

import com.animalsapp.mapper.AnimalInDtoToAnimal;
import com.animalsapp.model.Animal;
import com.animalsapp.repository.AnimalRepository;
import com.animalsapp.service.DTO.AnimalInDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    @Autowired
    AnimalRepository animalRepository;
    private final AnimalInDtoToAnimal mapper;

    @Autowired
    public AnimalService(AnimalInDtoToAnimal mapper) {
        this.mapper = mapper;
    }

    public Animal create(AnimalInDto animalInDto) {
        System.out.println("animalInDto = " + animalInDto);
        System.out.println("animal = " + mapper.map(animalInDto));
        Animal animal = mapper.map(animalInDto);
        return this.animalRepository.save(animal);
    }
}