package com.portfolio.service;

import com.portfolio.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    public List<Proyecto> getProyecto();
    public void editProyect(Long id, Proyecto pro);
    public Proyecto findProyect(Long id);
    public void deleteProyect(Long id);
    public Proyecto createProyect(Proyecto pro);
}
