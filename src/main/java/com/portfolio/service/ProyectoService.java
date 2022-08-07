package com.portfolio.service;

import com.portfolio.model.Proyecto;
import com.portfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    private ProyectoRepository proyectoRepo;
    
    @Override
    public List<Proyecto> getProyecto() {
        return proyectoRepo.findAll();
    }

    @Override
    public void editProyect(Long id, Proyecto pro) {
        Proyecto project = findProyect(id);
        project.setTitulo(pro.getTitulo());
        project.setDescripcion(pro.getDescripcion());
        project.setUrlFoto(pro.getUrlFoto());
        proyectoRepo.save(project);
    }

    @Override
    public Proyecto findProyect(Long id) {
        Proyecto exp = proyectoRepo.findById(id).orElse(null);
        return exp;
    }

    @Override
    public void deleteProyect(Long id) {
        proyectoRepo.deleteById(id);
    }

    @Override
    public Proyecto createProyect(Proyecto pro) {
        return proyectoRepo.save(pro);
    }
    

}
