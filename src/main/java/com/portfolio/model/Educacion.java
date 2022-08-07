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
@Entity(name = "educacion")
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idEdu;
    @Column(name = "nombre_escuela")
    private String nombreEscuela;
    private String descripcion;
    @Column(name = "fecha_inicio")
    private String fechaInicio;
    @Column(name = "fecha_fin")
    private String fechaFin;
    @Column(name = "url_escuela")
    private String urlEscuela;

    public Educacion() {
    }

    public Educacion(String nombreEscuela, String descripcion, String fechaInicio, String fechaFin, String urlEscuela) {
        this.nombreEscuela = nombreEscuela;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.urlEscuela = urlEscuela;
    }

    

}
