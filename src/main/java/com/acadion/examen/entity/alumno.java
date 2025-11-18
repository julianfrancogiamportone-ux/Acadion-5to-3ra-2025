package com.acadion.examen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String apellidonombre;
	private int DNI;
	private String email;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApellidonombre() {
		return apellidonombre;
	}

	public void setApellidonombre(String apellidonombre) {
		this.apellidonombre = apellidonombre;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public id_curso getId_curso() {
		return id_curso;
	}

	public void setId_curso(id_curso id_curso) {
		this.id_curso = id_curso;
	}

	public alumno(String apellidonombre, int dNI, String email, com.acadion.examen.entity.id_curso id_curso) {
		super();
		this.apellidonombre = apellidonombre;
		DNI = dNI;
		this.email = email;
		this.id_curso = id_curso;
	}

	public alumno() {
		super();
	}

	@ManyToOne 
	@JoinColumn (name="curso")
	private id_curso id_curso;
	
	
	
	
