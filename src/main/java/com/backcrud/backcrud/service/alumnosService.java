package com.backcrud.backcrud.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backcrud.backcrud.entity.Alumnos;
import com.backcrud.backcrud.repository.alumnosRepository;

import jakarta.validation.constraints.NotNull;

@Service
public class alumnosService {
    
    @Autowired
    alumnosRepository alumnosrepository;

    @NotNull
    public Long id;

    @Transactional
    public Optional<Alumnos> getAlumnosxId(Long alumnoid) {
        return alumnosrepository.buscarPorId(alumnoid);
    }
    
    @Transactional
    public void guardarxActualizar(Alumnos alumno){
        alumnosrepository.save(alumno);
    }


    @SuppressWarnings("null")
    public void delete(Long id) {
        alumnosrepository.deleteById(id);
    }

    public java.util.List<Alumnos> getAlumnos(){
        return alumnosrepository.getTodo();
    }
    
}
