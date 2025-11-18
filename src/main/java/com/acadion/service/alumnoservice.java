package com.acadion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acadion.Iservice.Ialumnoservice;
import com.acadion.entity.alumno;
import com.acadion.repository.alumnorepository;

@Service
public class alumnoservice implements Ialumnoservice {

	@Autowired
	private alumnorepository pRepository;

	@Override
	public List<alumno> findAllCharacters(){
		return pRepository.findAll();
	}

	@Override
	public alumno saveCharacter(alumno alumno) {
		return pRepository.save(alumno);
	}
	
	@Override
	public Optional<alumno> findCharacterById(long id){
		return pRepository.findById(id);
	}

}
