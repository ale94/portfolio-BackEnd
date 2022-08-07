package com.portfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idUser;
    @Column(name = "nombre_usuario")
    private String user;
    @Column(name = "contraseña")
    private String password;

    @OneToOne
    @JoinColumn(name = "creador_por")
    Persona persona;

    public Usuario() {
    }

    public Usuario(String user, String password, Persona persona) {
        this.user = user;
        this.password = password;
        this.persona = persona;
    }
}
