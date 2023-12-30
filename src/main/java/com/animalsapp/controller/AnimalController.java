package com.animalsapp.controller;

import com.animalsapp.model.Animal;
import com.animalsapp.repository.AnimalRepository;
import com.animalsapp.service.AnimalService;
import com.animalsapp.service.DTO.AnimalInDto;
import org.springframework.web.bind.annotation.*;

import java.util.Scanner;

@RestController
@RequestMapping("/animales")
public class AnimalController {

    private final AnimalService animalService;
    private final AnimalRepository animalRepository;

    public AnimalController(AnimalService animalService, AnimalRepository animalRepository) {

        this.animalService = animalService;
        this.animalRepository = animalRepository;
    }

    @PostMapping("/create")
    public Animal create(@RequestBody AnimalInDto animalInDto) {
        return this.animalService.create(animalInDto);
    }

    @GetMapping("/all")
    public Iterable<Animal> getAll() {
        return animalRepository.findAll();
    }

}
