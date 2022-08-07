package com.portfolio.controller;

import com.portfolio.model.Educacion;
import com.portfolio.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
public class EducacionController {
    
    @Autowired
    private IEducacionService eduService;
    
    @GetMapping("/educacion")
    public List<Educacion> mostrarEdu() {
        return eduService.getEducacion();
    }
    
    @PostMapping("/educacion")
    public void createEduc(@RequestBody Educacion educ) {
        eduService.createEduc(educ);
    }
    
    @PutMapping("/educacion/{id}")
    public void editarEduc(@PathVariable Long id, @RequestBody Educacion educ) {
        eduService.editEduc(id, educ);
    }
    
    @DeleteMapping("/educacion/{id}")
    public void eliminarEduc(@PathVariable Long id) {
        eduService.deleteEduc(id);
    }

}
