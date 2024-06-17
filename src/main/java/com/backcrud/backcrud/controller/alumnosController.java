package com.backcrud.backcrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backcrud.backcrud.entity.Alumnos;
import com.backcrud.backcrud.service.alumnosService;

@RestController
@RequestMapping(path="api/v2/alumnos")
@CrossOrigin(origins = "http://localhost:4200/")

public class alumnosController {

    @Autowired
    private alumnosService alumnosservice;

//Buscar Alumnos
    @GetMapping
    public List<Alumnos> getAlumnos() {
        return alumnosservice.getAlumnos();
    }
    
//Actualizar Alumnos
    @PostMapping
    public void saveUpdate(@RequestBody Alumnos alumno){
        alumnosservice.guardarxActualizar(alumno);
    }
    
//Eliminar Alumnos
    @DeleteMapping("{alumnosId}")
    public void delete(@PathVariable("alumnosId") Long alumnosId){
        alumnosservice.delete(alumnosId);
        
    }

//Buscar Alumno por Id
    @GetMapping("{alumnosId}")
    public Optional<Alumnos> getById(@PathVariable("alumnosId") Long alumnosId){
        return alumnosservice.getAlumnosxId(alumnosId);
    }
}

