package com.acadion.materia.entity;

public class materia {
	@Entity
	public class Materia {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id_materia;

	    private String nombre_materia;

	    @ManyToOne
	    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso")
	    private Curso curso;

	    @ManyToOne
	    @JoinColumn(name = "id_profesor", referencedColumnName = "id_profesor")
	    private Profesor profesor;

	    // Constructores
	    public Materia() {
	    }

	    public Materia(String nombre_materia, Curso curso, Profesor profesor) {
	        this.nombre_materia = nombre_materia;
	        this.curso = curso;
	        this.profesor = profesor;
	    }

	    // Getters y Setters
	    public Long getId_materia() {
	        return id_materia;
	    }

	    public void setId_materia(Long id_materia) {
	        this.id_materia = id_materia;
	    }

	    public String getNombre_materia() {
	        return nombre_materia;
	    }

	    public void setNombre_materia(String nombre_materia) {
	        this.nombre_materia = nombre_materia;
	    }

	    public Curso getCurso() {
	        return curso;
	    }

	    public void setCurso(Curso curso) {
	        this.curso = curso;
	    }

	    public Profesor getProfesor() {
	        return profesor;
	    }

	    public void setProfesor(Profesor profesor) {
	        this.profesor = profesor;
	    }
	}

}
