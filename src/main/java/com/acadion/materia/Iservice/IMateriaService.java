package com.acadion.materia.Iservice;

import java.util.List;
import com.acadion.materia.entity.Materia;

public interface IMateriaService {

    public List<Materia> listar();
    public Materia guardar(Materia materia);
    public Materia buscarPorId(Long id);
    public void eliminar(Long id);

}