package com.animalsapp.service;

import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    public String obtenerSaludo() {
        return "Hola desde AnimalService";
    }
}