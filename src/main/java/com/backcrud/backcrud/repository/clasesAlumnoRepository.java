package com.backcrud.backcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.backcrud.backcrud.entity.ClasesAlumno;

@Repository
public interface clasesAlumnoRepository extends JpaRepository<ClasesAlumno, Long>{

     @Query(
    value = "SELECT * FROM clases_alumnos ORDER BY id ASC;",
    nativeQuery = true
    )
    List<ClasesAlumno> getTodo();

    @Modifying
    @Query(
        value = "INSERT INTO clases_alumnos (id, alumno_alumno_id, clases_clases_id) VALUES (:id, :alumno_id, :clases_id) " +
                "ON CONFLICT (id) DO UPDATE SET alumno_alumno_id = :alumno_id, clases_clases_id = :clases_id",
        nativeQuery = true
    )
    void guardarOActualizar(@Param("id") Long id, @Param("alumno_id") Long alumno_id, @Param("clases_id") Long clases_id);
}