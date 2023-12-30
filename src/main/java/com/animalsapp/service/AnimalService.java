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
    private final AnimalRepository animalRepository;
    private final AnimalInDtoToAnimal mapper;

    @Autowired
    public AnimalService(AnimalInDtoToAnimal mapper, AnimalRepository animalRepository) {
        this.mapper = mapper;
        this.animalRepository = animalRepository;
    }

    public Animal create(AnimalInDto animalInDto) {
        Animal animal = mapper.map(animalInDto);
        return this.animalRepository.save(animal);
    }
}