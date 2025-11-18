package com.acadion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acadion.Iservice.Iexamenservice;
import com.acadion.entity.examen;
import com.acadion.repository.examenrepository;

@Service
public class examenservice implements Iexamenservice {

	@Autowired
	private examenrepository pRepository;

	@Override
	public List<examen> findAllCharacters(){
		return pRepository.findAll();
	}

	@Override
	public examen saveCharacter(examen examen) {
		return pRepository.save(examen);
	}
	
	@Override
	public Optional<examen> findCharacterById(long id){
		return pRepository.findById(id);
	}

}

