package com.animalsapp.service.DTO;

import com.animalsapp.model.Comentario;
import com.animalsapp.model.Usuario;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class AnimalInDto {

    private String nombreAnimal;
    private String tipoAnimal;
    private String descripcion;
    private String ubicacion;
}
