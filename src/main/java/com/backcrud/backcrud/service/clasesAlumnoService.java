package com.backcrud.backcrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backcrud.backcrud.entity.ClasesAlumno;
import com.backcrud.backcrud.repository.alumnosRepository;
import com.backcrud.backcrud.repository.clasesAlumnoRepository;
import com.backcrud.backcrud.repository.clasesRepository;

@Service
public class clasesAlumnoService {

    public clasesAlumnoService(alumnosRepository alumnosrepository, clasesRepository claseRepository) {
    }

    @Autowired
    clasesAlumnoRepository clasesalumnorepository;

    public List<ClasesAlumno> getClasesAlumno() {
        return clasesalumnorepository.getTodo();
    }

    @SuppressWarnings("null")
    public Optional<ClasesAlumno> getClasesAlumno(Long id) {
        return clasesalumnorepository.findById(id);
    }

    @SuppressWarnings("null")
    public void saveOrUpdate(ClasesAlumno clasesAlumno) {
        clasesalumnorepository.save(clasesAlumno);
    }

    @SuppressWarnings("null")
    public void delete(Long id) {
        clasesalumnorepository.deleteById(id);
    }
}
