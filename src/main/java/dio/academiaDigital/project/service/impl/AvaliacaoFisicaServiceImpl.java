package dio.academiaDigital.project.service.impl;

import dio.academiaDigital.project.entity.AvaliacaoFisica;
import dio.academiaDigital.project.entity.form.AvaliacaoFisicaForm;
import dio.academiaDigital.project.entity.form.AvaliacaoFisicaUpdateForm;
import dio.academiaDigital.project.repository.AvaliacaoFisicaRepository;
import dio.academiaDigital.project.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository repository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        return null;
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return null;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
