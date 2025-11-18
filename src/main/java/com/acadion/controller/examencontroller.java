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

import com.acadion.Iservice.Iexamenservice;
import com.acadion.entity.examen;



@RestController
@RequestMapping("/api/examen")
@CrossOrigin(origins = "*")
public class examencontroller {

	@Autowired
	private Iexamenservice pService;
	
	@GetMapping
	public List<examen> getAllCharacters(){
		return pService.findAllCharacters();
	}
	@GetMapping("/examen/{id}")
	public Optional<examen> getCharactersById(@PathVariable Long id){
		return pService.findCharacterById(id);
	}
	@PostMapping
	public examen createCharacter(@RequestBody examen examen) {
		return pService.saveCharacter(examen);
	}
}
