package com.acadion.materia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acadion.examen.entity.examen;

@Repository
public interface MateriaRepository extends CrudRepository<Materia, Long> {

}