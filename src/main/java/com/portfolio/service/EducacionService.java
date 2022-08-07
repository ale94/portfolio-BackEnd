package com.portfolio.service;

import com.portfolio.model.Educacion;
import com.portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    private EducacionRepository eduRepository;

    @Override
    public List<Educacion> getEducacion() {
        return eduRepository.findAll();
    }

    @Override
    public void editEduc(Long id, Educacion educ) {
        Educacion edu = findEduc(id);
        edu.setNombreEscuela(educ.getNombreEscuela());
        edu.setDescripcion(educ.getDescripcion());
        edu.setFechaInicio(educ.getFechaInicio());
        edu.setFechaFin(educ.getFechaFin());
        edu.setUrlEscuela(educ.getUrlEscuela());
        eduRepository.save(edu);
    }

    @Override
    public Educacion findEduc(Long id) {
        Educacion educ = eduRepository.findById(id).orElse(null);
        return educ;
    }

    @Override
    public void deleteEduc(Long id) {
        eduRepository.deleteById(id);
    }

    @Override
    public Educacion createEduc(Educacion educ) {
        return eduRepository.save(educ);
    }

}
