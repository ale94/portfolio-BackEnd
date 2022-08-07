package com.portfolio.service;

import com.portfolio.model.Educacion;
import java.util.List;

public interface IEducacionService {
    public List<Educacion> getEducacion();
    public void editEduc(Long id, Educacion educ);
    public Educacion findEduc(Long id);
    public void deleteEduc(Long id);
    public Educacion createEduc(Educacion educ);
}
