package com.acadion.profesor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.acadion.profesor.entity.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {

}