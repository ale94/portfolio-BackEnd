package com.portfolio.controller;

import com.portfolio.model.Persona;
import com.portfolio.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    
    @Autowired
    private IPersonaService persoService;
    
    @GetMapping("/persona/{id}")
    public Persona mostrar(@PathVariable Long id) {
        return persoService.findPersona(id);
    }
   
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/persona/titulo/{id}")
    public void editarTitulo(@PathVariable Long id, @RequestBody Persona per) {
        persoService.editPersonaTitulo(id, per);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/persona/sobre/{id}")
    public void editarSobreMi(@PathVariable Long id, @RequestBody Persona per) {
        persoService.editPersonaSobreMi(id, per);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/persona/url/{id}")
    public void editarUrl(@PathVariable Long id, @RequestBody Persona per) {
        persoService.editPersonaUrl(id, per);
    }

}
