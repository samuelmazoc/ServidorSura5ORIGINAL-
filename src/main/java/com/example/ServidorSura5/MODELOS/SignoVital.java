package com.example.ServidorSura5.MODELOS;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "signovital")
public class SignoVital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String valores;
    private LocalDate fechaMedida;

    @ManyToOne
    @JoinColumn(name = "fk_paciente", referencedColumnName = "id")
    @JsonBackReference
    private Paciente paciente;

    public SignoVital() {
    }

    public SignoVital(Long id, String nombre, String valores, LocalDate fechaMedida) {
        this.id = id;
        this.nombre = nombre;
        this.valores = valores;
        this.fechaMedida = fechaMedida;
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

    public String getValores() {
        return valores;
    }

    public void setValores(String valores) {
        this.valores = valores;
    }

    public LocalDate getFechaMedida() {
        return fechaMedida;
    }

    public void setFechaMedida(LocalDate fechaMedida) {
        this.fechaMedida = fechaMedida;
    }
}
