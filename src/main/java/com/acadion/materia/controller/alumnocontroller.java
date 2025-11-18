package com.acadion.materia.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acadion.examen.Iservice.Ialumnoservice;
import com.acadion.examen.entity.alumno;



@RestController
@RequestMapping("/api/materia")
@CrossOrigin("*")
public class alumnocontroller {

    @Autowired
    private IMateriaService service;

    @GetMapping("/listar")
    public List<Materia> listar() {
        return service.listar();
    }

    @GetMapping("/listar/{id}")
    public Optional<Materia> listarId(@PathVariable Long id) {
        return service.listarId(id);
    }

    @PostMapping("/guardar")
    public int save(@RequestBody Materia m) {
        return service.save(m);
    }

    @DeleteMapping("/eliminar/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
