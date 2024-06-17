package com.backcrud.backcrud.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "clasesAlumnos")
@Entity

public class ClasesAlumno {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Clase clases;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Alumnos alumno;

    public ClasesAlumno(Alumnos alumnos, Clase clase) {
        this.alumno = alumnos;
        this.clases = clase;
    }

    public ClasesAlumno() {
    }
    
}
