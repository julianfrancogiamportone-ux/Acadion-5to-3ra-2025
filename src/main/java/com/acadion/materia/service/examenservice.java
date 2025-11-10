package com.acadion.materia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acadion.examen.Iservice.Iexamenservice;
import com.acadion.examen.entity.examen;
import com.acadion.examen.repository.examenrepository;

@Service
public class MateriaService implements IMateriaService {

    @Autowired
    private MateriaRepository data;

    @Override
    public List<Materia> listar() {
        return (List<Materia>) data.findAll();
    }

    @Override
    public Optional<Materia> listarId(Long id) {
        return data.findById(id);
    }

    @Override
    public int save(Materia m) {
        int res = 0;
        Materia materia = data.save(m);
        if (materia != null) {
            res = 1;
        }
        return res;
    }

    @Override
    public void delete(Long id) {
        data.deleteById(id);
    }
}
