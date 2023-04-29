package dio.academiaDigital.project.service;

import dio.academiaDigital.project.entity.AvaliacaoFisica;

import java.util.List;

public interface IAvaliacaoFisica {
//    AvaliacaoFisica create(AvaliacaoFisicaForm form);
    AvaliacaoFisica get(Long id);
    List<AvaliacaoFisica> getAll();
//    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    void delete(Long id);
}

