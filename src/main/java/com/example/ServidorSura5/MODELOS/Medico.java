package com.example.ServidorSura5.MODELOS;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "medicos")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String matriculaProfesional;
    private String especialidad;
    private Double salario;
    private String ips;
    private String correo;
    private String telefono;
    private String direccion;
    private Boolean disponibleFinDeSemana;

    //Crenado una relacion con la clase paciente
    //me ralaciono con muchos pacientes

    @OneToMany (mappedBy = "medico")
    @JsonManagedReference
    private List<Paciente> pacientes;

    public Medico() {
    }

    public Medico(Long id, String nombre, String matriculaProfesional, String especialidad, Double salario, String ips, String correo, String telefono, String direccion, Boolean disponibleFinDeSemana) {
        this.id = id;
        this.nombre = nombre;
        this.matriculaProfesional = matriculaProfesional;
        this.especialidad = especialidad;
        this.salario = salario;
        this.ips = ips;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.disponibleFinDeSemana = disponibleFinDeSemana;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatriculaProfesional() {
        return matriculaProfesional;
    }

    public void setMatriculaProfesional(String matriculaProfesional) {
        this.matriculaProfesional = matriculaProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getDisponibleFinDeSemana() {
        return disponibleFinDeSemana;
    }

    public void setDisponibleFinDeSemana(Boolean disponibleFinDeSemana) {
        this.disponibleFinDeSemana = disponibleFinDeSemana;
    }
}
