package com.acadion.Iservice;

import java.util.List;
import java.util.Optional;

import com.acadion.entity.alumno;

public interface Ialumnoservice {
	
	public List<alumno> findAllCharacters();
	public alumno saveCharacter(alumno alumno);
	public Optional<alumno> findCharacterById(long id);
	
}