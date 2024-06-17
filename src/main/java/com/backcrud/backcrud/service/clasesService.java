package com.backcrud.backcrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backcrud.backcrud.entity.Clase;
import com.backcrud.backcrud.repository.clasesRepository;

@Service
public class clasesService {

    @Autowired
    clasesRepository clasesrepository;

    public List<Clase> getClases() {
        return clasesrepository.getTodo();
    }

    @SuppressWarnings("null")
    public Optional<Clase> getClases(Long claseId) {
        return clasesrepository.findById(claseId);
    }

    @SuppressWarnings("null")
    public void saveOrUpdate(Clase Clase) {
        clasesrepository.save(Clase);
    }

    @SuppressWarnings("null")
    public void delete(Long id) {
        clasesrepository.deleteById(id);
    }
}
