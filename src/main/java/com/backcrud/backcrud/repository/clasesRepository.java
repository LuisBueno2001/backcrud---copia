package com.backcrud.backcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backcrud.backcrud.entity.Clase;

@Repository
public interface clasesRepository extends JpaRepository<Clase, Long>{
        @Query(
        value = "SELECT * FROM clases ORDER BY clases_id ASC;",
        nativeQuery = true
    )
    List<Clase> getTodo(); 
}
