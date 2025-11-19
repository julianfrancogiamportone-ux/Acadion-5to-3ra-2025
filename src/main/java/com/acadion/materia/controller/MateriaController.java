package com.acadion.materia.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.acadion.materia.entity.Materia;
import com.acadion.materia.iservice.IMateriaService;

@RestController
@RequestMapping("/api/materia")
@CrossOrigin("*")
public class MateriaController {

    private final IMateriaService materiaService;

    public MateriaController(IMateriaService materiaService) {
        this.materiaService = materiaService;
    }

    @GetMapping("/listar")
    public List<Materia> listar() {
        return materiaService.listar();
    }

    @PostMapping("/guardar")
    public Materia guardar(@RequestBody Materia materia) {
        return materiaService.guardar(materia);
    }

    @GetMapping("/buscar/{id}")
    public Materia buscar(@PathVariable Long id) {
        return materiaService.buscarPorId(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        materiaService.eliminar(id);
    }
}