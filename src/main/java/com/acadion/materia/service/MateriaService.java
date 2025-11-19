package com.acadion.materia.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.acadion.materia.entity.Materia;
import com.acadion.materia.repository.MateriaRepository;
import com.acadion.materia.iservice.IMateriaService;

@Service
public class MateriaService implements IMateriaService {

    private final MateriaRepository materiaRepository;

    public MateriaService(MateriaRepository materiaRepository) {
        this.materiaRepository = materiaRepository;
    }

    @Override
    public List<Materia> listar() {
        return materiaRepository.findAll();
    }

    @Override
    public Materia guardar(Materia materia) {
        return materiaRepository.save(materia);
    }

    @Override
    public Materia buscarPorId(Long id) {
        return materiaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        materiaRepository.deleteById(id);
    }
}