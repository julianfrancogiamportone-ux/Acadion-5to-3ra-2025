package com.acadion.materia.Iservice;

import java.util.List;
import java.util.Optional;

import com.acadion.examen.entity.examen;


public interface Iexamenservice {
    public List<Materia> listar();
    public Optional<Materia> listarId(Long id);
    public int save(Materia m);
    public void delete(Long id);
}