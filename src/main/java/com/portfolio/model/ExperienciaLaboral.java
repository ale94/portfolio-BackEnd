package com.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "experiencia_laboral")
public class ExperienciaLaboral {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idExp;
    @Column(name = "nombre_empresa", length = 100)
    private String nombreEmpresa;
    @Column(name = "es_trabajo_actual")
    private String esTrabajoActual;
    @Column(name = "fecha_inicio")
    private String fechaInicio;
    @Column(name = "fecha_fin")
    private String fechaFin;
    @Column(length = 1000)
    private String descripcion;
    
    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(String nombreEmpresa, String esTrabajoActual, String fechaInicio, String fechaFin, String descripcion, Persona persona) {
        this.nombreEmpresa = nombreEmpresa;
        this.esTrabajoActual = esTrabajoActual;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
    }

}
