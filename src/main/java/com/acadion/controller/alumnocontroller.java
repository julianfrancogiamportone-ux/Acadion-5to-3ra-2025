package com.acadion.controller;

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

import com.acadion.Iservice.Ialumnoservice;
import com.acadion.entity.alumno;



@RestController
@RequestMapping("/api/alumnos")
@CrossOrigin(origins = "*")
public class alumnocontroller {

	@Autowired
	private Ialumnoservice pService;
	
	@GetMapping
	public List<alumno> getAllCharacters(){
		return pService.findAllCharacters();
	}
	@GetMapping("/alumno/{id}")
	public Optional<alumno> getCharactersById(@PathVariable Long id){
		return pService.findCharacterById(id);
	}
	@PostMapping
	public alumno createCharacter(@RequestBody alumno alumno) {
		return pService.saveCharacter(alumno);
	}
}
