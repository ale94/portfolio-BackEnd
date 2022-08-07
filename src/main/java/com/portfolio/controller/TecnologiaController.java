package com.portfolio.controller;

import com.portfolio.model.Tecnologia;
import com.portfolio.service.TecnologiaService;
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
public class TecnologiaController {
    
    @Autowired
    private TecnologiaService tecnoService;
    
    @GetMapping("/tecnologia")
    public List<Tecnologia> mostrarTecno() {
        return tecnoService.getTecnologia();
    }
    
    @PostMapping("/tecnologia")
    public void createTecno(@RequestBody Tecnologia tec) {
        tecnoService.createTecno(tec);
    }
    
    @PutMapping("/tecnologia/{id}")
    public void editarTecno(@PathVariable Long id, @RequestBody Tecnologia tec) {
        tecnoService.editTecno(id, tec);
    }
    
    @DeleteMapping("/tecnologia/{id}")
    public void eliminarTecno(@PathVariable Long id) {
        tecnoService.deleteTecno(id);
    }

}
