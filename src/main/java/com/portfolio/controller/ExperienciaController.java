package com.portfolio.controller;

import com.portfolio.model.ExperienciaLaboral;
import com.portfolio.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService expService;
    
    @GetMapping("/experiencia")
    public List<ExperienciaLaboral> mostrarExp() {
        return expService.getExperiencias();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/experiencia")
    public void createEmp(@RequestBody ExperienciaLaboral exp) {
        expService.createExp(exp);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/experiencia/{id}")
    public void editarEmpresa(@PathVariable Long id, @RequestBody ExperienciaLaboral exp) {
        expService.editExperiencia(id, exp);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/experiencia/{id}")
    public void eliminarEmpresa(@PathVariable Long id) {
        expService.deleteExp(id);
    }
    
    

}
