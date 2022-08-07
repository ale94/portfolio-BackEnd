package com.portfolio.service;

import com.portfolio.model.Persona;

public interface IPersonaService {
    public void editPersonaTitulo(Long id, Persona persona);
    public void editPersonaSobreMi(Long id, Persona persona);
    public void editPersonaUrl(Long id, Persona persona);
    public Persona findPersona(Long id);
}
