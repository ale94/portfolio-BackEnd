package com.portfolio.service;

import com.portfolio.model.ExperienciaLaboral;
import com.portfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    private ExperienciaRepository expRepository;

    @Override
    public List<ExperienciaLaboral> getExperiencias() {
        return expRepository.findAll();
    }

    @Override
    public void editExperiencia(Long id, ExperienciaLaboral exper) {
        ExperienciaLaboral exp = findExp(id);
        exp.setNombreEmpresa(exper.getNombreEmpresa());
        exp.setDescripcion(exper.getDescripcion());
        exp.setFechaInicio(exper.getFechaInicio());
        exp.setFechaFin(exper.getFechaFin());
        expRepository.save(exp);
    }

    @Override
    public ExperienciaLaboral findExp(Long id) {
        ExperienciaLaboral exp = expRepository.findById(id).orElse(null);
        return exp;
    }

    @Override
    public void deleteExp(Long id) {
        expRepository.deleteById(id);
    }

    @Override
    public ExperienciaLaboral createExp(ExperienciaLaboral exp) {
        return expRepository.save(exp);
    }

}
