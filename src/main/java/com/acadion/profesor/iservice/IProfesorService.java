package com.acadion.profesor.iservice;

import java.util.List;
import com.acadion.profesor.entity.Profesor;

public interface IProfesorService {
    public List<Profesor> listar();
    public Profesor guardar(Profesor profesor);
    public Profesor buscarPorId(Long id);
    public void eliminar(Long id);
}
