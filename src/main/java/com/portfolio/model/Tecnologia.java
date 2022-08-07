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
@Entity(name = "tecnologia")
public class Tecnologia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idTec;
    private String nombre;
    private String descripcion;
    @Column(name = "url_tecno")
    private String urlTec;
    private int porcentaje;
    
    public Tecnologia() {
    }

    public Tecnologia(String nombre, String descripcion, String urlTec, int porcentaje, Persona persona) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlTec = urlTec;
        this.porcentaje = porcentaje;
    }
    
    
}
