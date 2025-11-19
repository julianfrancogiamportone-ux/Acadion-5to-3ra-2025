package com.acadion.profesor.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.acadion.profesor.entity.Profesor;
import com.acadion.profesor.repository.ProfesorRepository;
import com.acadion.profesor.iservice.IProfesorService;

@Service
public class ProfesorService implements IProfesorService {

    private final ProfesorRepository profesorRepository;

    public ProfesorService(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    @Override
    public List<Profesor> listar() {
        return profesorRepository.findAll();
    }

    @Override
    public Profesor guardar(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    @Override
    public Profesor buscarPorId(Long id) {
        return profesorRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        profesorRepository.deleteById(id);
    }
}
