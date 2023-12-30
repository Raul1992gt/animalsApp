package com.animalsapp.controller;

import com.animalsapp.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
public class AnimalController {


    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {this.animalService = animalService;}

    @GetMapping("/saludo")
    public String saludo() {return animalService.obtenerSaludo();}

}
