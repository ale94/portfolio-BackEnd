package com.portfolio.service;

import com.portfolio.model.ExperienciaLaboral;
import java.util.List;

public interface IExperienciaService {
    public List<ExperienciaLaboral> getExperiencias();
    public void editExperiencia(Long id, ExperienciaLaboral exp);
    public ExperienciaLaboral findExp(Long id);
    public void deleteExp(Long id);
    public ExperienciaLaboral createExp(ExperienciaLaboral exp);
}
