package com.backcrud.backcrud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table (name="Alumnos")
@Entity

public class Alumnos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long alumno_id;
    
    private String nombre; 

    public Alumnos(Long alumno_id) {
        this.alumno_id = alumno_id;
    }

    public Alumnos() {
    }
}
