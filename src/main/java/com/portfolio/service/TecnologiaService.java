package com.portfolio.service;

import com.portfolio.model.Tecnologia;
import com.portfolio.repository.TecnologiaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaService implements ITecnologiaService{
    
    @Autowired
    private TecnologiaRepository tecnoRepo;

    @Override
    public List<Tecnologia> getTecnologia() {
        return tecnoRepo.findAll();
    }

    @Override
    public void editTecno(Long id, Tecnologia tec) {
        Tecnologia tecno = findTecno(id);
        tecno.setNombre(tec.getNombre());
        tecno.setDescripcion(tec.getDescripcion());
        tecno.setUrlTec(tec.getUrlTec());
        tecno.setPorcentaje(tec.getPorcentaje());
        tecnoRepo.save(tecno);
    }

    @Override
    public Tecnologia findTecno(Long id) {
        Tecnologia tecno = tecnoRepo.findById(id).orElse(null);
        return tecno;
    }

    @Override
    public void deleteTecno(Long id) {
        tecnoRepo.deleteById(id);
    }

    @Override
    public Tecnologia createTecno(Tecnologia tec) {
        return tecnoRepo.save(tec);
    }

}
