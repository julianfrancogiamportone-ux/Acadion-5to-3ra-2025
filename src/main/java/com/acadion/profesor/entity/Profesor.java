package com.acadion.profesor.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
@Table(name = "profesor")
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_profesor;

    private String apellido_nombre_profesor;
    private String dni;
    private String email;

    public Profesor() {}

    public Long getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(Long id_profesor) {
       
        this.id_profesor = id_profesor;
    }

    public String getApellido_nombre_profesor() {
        return apellido_nombre_profesor;
    }

    public void setApellido_nombre_profesor(String apellido_nombre_profesor) {
        this.apellido_nombre_profesor = apellido_nombre_profesor;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}