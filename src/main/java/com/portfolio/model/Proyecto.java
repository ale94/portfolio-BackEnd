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
@Entity(name = "proyecto")
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idPro;
    @Column(length = 100)
    private String titulo;
    @Column(length = 100)
    private String descripcion;
    @Column(name = "url_foto")
    private String urlFoto;
    @Column(name = "url_repositorio")
    private String urlRepositorio;
    
    public Proyecto() {
    }

    public Proyecto(String titulo, String descripcion, String urlFoto) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.urlFoto = urlFoto;
    }
    
}
