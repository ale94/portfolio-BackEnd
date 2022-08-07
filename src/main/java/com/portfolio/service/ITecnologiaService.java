package com.portfolio.service;

import com.portfolio.model.Tecnologia;
import java.util.List;

public interface ITecnologiaService {
    public List<Tecnologia> getTecnologia();
    public void editTecno(Long id, Tecnologia tec);
    public Tecnologia findTecno(Long id);
    public void deleteTecno(Long id);
    public Tecnologia createTecno(Tecnologia tec);
}
