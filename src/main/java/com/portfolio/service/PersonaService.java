package com.portfolio.service;

import com.portfolio.model.Persona;
import com.portfolio.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    private PersonaRepository perRepository;
    
    @Override
    public Persona findPersona(Long id) {
        Persona p = perRepository.findById(id).orElse(null);
        return p;
    }

    @Override
    public void editPersonaTitulo(Long id, Persona persona) {
        Persona p = findPersona(id);
        p.setTitulo(persona.getTitulo());
        perRepository.save(p);
    }

    @Override
    public void editPersonaSobreMi(Long id, Persona persona) {
        Persona p = findPersona(id);
        p.setSobreMi(persona.getSobreMi());
        perRepository.save(p);
    }

    @Override
    public void editPersonaUrl(Long id, Persona persona) {
        Persona p = findPersona(id);
        p.setUrlPer(persona.getUrlPer());
        perRepository.save(p);
    }

}
