package com.backcrud.backcrud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table (name="Clases")
@Entity

public class Clase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clases_id;
    private String materia;

    public Clase(Long clases_id) {
        this.clases_id = clases_id;
    }

    public Clase() {
    }
    
}
