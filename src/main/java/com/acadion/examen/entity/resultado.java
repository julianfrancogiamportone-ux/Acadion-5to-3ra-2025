package com.acadion.examen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;


@Entity
public class resultado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int nota;
	private String observacion;
	
	@JoinColumn (name = "alumno_id")
	private alumno alumno;
	
	@OneToOne (mappedBy = "resultado")
	private examen examen;
	
	public void Pj (int nota, String observacion, alumno alumno, examen examen) {
		this.nota = nota;
		this.observacion = observacion;
		this.alumno = alumno;
		this.examen = examen;
	}
	
	public int getnota() {
		return nota;
	}
	public void setnota(int nota) {
		this.nota = nota;
	}
	public String getobservacion() {
		return observacion;
	}
	public void setobservacion(String observacion) {
		this.observacion = observacion;
	}
	public alumno getalumno() {
		return alumno;
	}
	public void setalumno(alumno alumno) {
		this.alumno = alumno;
	}
	public examen getexamen() {
		return examen;
	}
	public void setexamen(examen examen) {
		this.examen = examen;
	}
	
	
	
}
