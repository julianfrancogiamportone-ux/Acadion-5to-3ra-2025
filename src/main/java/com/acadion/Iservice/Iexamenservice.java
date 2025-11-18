package com.acadion.Iservice;

import java.util.List;
import java.util.Optional;

import com.acadion.entity.examen;


public interface Iexamenservice {
	
	public List<examen> findAllCharacters();
	public examen saveCharacter(examen examen);
	public Optional<examen> findCharacterById(long id);
	
}