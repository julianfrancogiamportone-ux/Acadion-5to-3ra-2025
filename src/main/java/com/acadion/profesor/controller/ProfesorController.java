package com.acadion.profesor.controller;

import java.util.List;
import com.acadion.profesor.entity.Profesor;
import com.acadion.profesor.iservice.IProfesorService;

@RestController
@RequestMapping("/api/profesor")
@CrossOrigin("*")
public class ProfesorController {

    private final IProfesorService profesorService;

    public ProfesorController(IProfesorService profesorService) {
        this.profesorService = profesorService;
    }

    @GetMapping("/listar")
    public List<Profesor> listar() {
        return profesorService.listar();
    }

    @PostMapping("/guardar")
    public Profesor guardar(@RequestBody Profesor profesor) {
        return profesorService.guardar(profesor);
    }

    @GetMapping("/buscar/{id}")
    public Profesor buscar(@PathVariable Long id) {
        return profesorService.buscarPorId(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        profesorService.eliminar(id);
    }
}