package com.portfolio.controller;

import com.portfolio.model.Proyecto;
import com.portfolio.service.IProyectoService;
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
public class ProyectoController {
    
    @Autowired
    private IProyectoService proyectoService;
    
    @GetMapping("/proyecto")
    public List<Proyecto> mostrarProy() {
        return proyectoService.getProyecto();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/proyecto")
    public void createEmp(@RequestBody Proyecto proyect) {
        proyectoService.createProyect(proyect);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/proyecto/{id}")
    public void editarEmpresa(@PathVariable Long id, @RequestBody Proyecto proyect) {
        proyectoService.editProyect(id, proyect);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/proyecto/{id}")
    public void eliminarEmpresa(@PathVariable Long id) {
        proyectoService.deleteProyect(id);
    }
}
