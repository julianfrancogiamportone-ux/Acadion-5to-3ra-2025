package com.acadion.examen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class examen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fecha;
	private String hora_inicio;
	private String hora_final;
	private  int aula; 
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora_inicio() {
		return hora_inicio;
	}

	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public String getHora_final() {
		return hora_final;
	}

	public void setHora_final(String hora_final) {
		this.hora_final = hora_final;
	}

	public int getAula() {
		return aula;
	}

	public void setAula(int aula) {
		this.aula = aula;
	}

	public materia getMateria() {
		return materia;
	}

	public void setMateria(materia materia) {
		this.materia = materia;
	}

	public examen(String fecha, String hora_inicio, String hora_final, int aula,
			com.acadion.examen.entity.materia materia) {
		super();
		this.fecha = fecha;
		this.hora_inicio = hora_inicio;
		this.hora_final = hora_final;
		this.aula = aula;
		this.materia = materia;
	}

	public examen() {
		super();
	}

	@ManyToOne 
	@JoinColumn (name="materia")
	private materia materia;
}