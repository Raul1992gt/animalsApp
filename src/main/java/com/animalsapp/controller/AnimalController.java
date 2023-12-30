package com.animalsapp.controller;

import com.animalsapp.model.Animal;
import com.animalsapp.service.AnimalService;
import com.animalsapp.service.DTO.AnimalInDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/animales")
public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @PostMapping("/create")
    public Animal create(@RequestBody AnimalInDto animalInDto) {
        return this.animalService.create(animalInDto);
    }

}
