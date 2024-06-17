package com.backcrud.backcrud.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.backcrud.backcrud.entity.Alumnos;

@Repository
public interface alumnosRepository extends JpaRepository<Alumnos, Long>{

    @Query(
        value = "SELECT * FROM alumnos ORDER BY alumno_id ASC;",
        nativeQuery = true
    )
    List<Alumnos> getTodo(); 

    @Modifying
    @Query(
        value = "DELETE FROM alumnos WHERE alumnos.alumno_id = :alumno_id ORDER BY alumno_id ASC;",
        nativeQuery = true
    )
    void Borrar(@Param("alumno_id") Long alumno_id );

    @Query(
    value = "SELECT a FROM Alumnos a WHERE a.id = :id"
    )
    Optional<Alumnos> buscarPorId(@Param("id") Long id);

    @Modifying
    @Query(
        value = "INSERT INTO Alumnos (alumno_id, nombre) VALUES (:alumno_id, :nombre) " +
                "ON CONFLICT (alumno_id) DO UPDATE SET nombre = :nombre",
        nativeQuery = true
    )
    void guardarOActualizar(@Param("alumno_id") Long alumno_id, @Param("nombre") String nombre);
/*
    @Query(
        value = "SELECT alumnos FROM prueba2 alumnos WHERE alumnos.id = :id"
    )
    Optional<alumnos> Buscar(@Param("id") Long id);

    @Modifying
    @Query(
        value = "INSERT INTO alumnos (alumno_id, nombre) VALUES (:id, :nombre);", 
        nativeQuery = true
    )
    int Guardar(@Param("alumno_id")Long id, @Param("nombre")String nombre);

*/
}
