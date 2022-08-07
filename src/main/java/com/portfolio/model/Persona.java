package com.portfolio.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idPer;
    @Column(length = 100)
    private String nombre;
    @Column(length = 100)
    private String apellido;
    @Column(name = "fecha_nacimiento")
    private Date fechaNac;
    @Column(length = 100)
    private String telefono;
    @Column(length = 100)
    private String correo;
    @Column(length = 100)
    private String titulo;
    @Column(name="sobre_mi")
    private String sobreMi;
    @Column(name="url_perfil")
    private String urlPer;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Date fechaNac, String telefono, String correo, String titulo, String sobreMi, String urlPer) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.correo = correo;
        this.titulo = titulo;
        this.sobreMi = sobreMi;
        this.urlPer = urlPer;
    }

}
