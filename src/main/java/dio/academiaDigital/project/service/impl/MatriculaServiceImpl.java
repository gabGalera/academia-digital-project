package dio.academiaDigital.project.service.impl;

import dio.academiaDigital.project.entity.Aluno;
import dio.academiaDigital.project.entity.AvaliacaoFisica;
import dio.academiaDigital.project.entity.form.AlunoForm;
import dio.academiaDigital.project.entity.form.AlunoUpdateForm;
import dio.academiaDigital.project.repository.MatriculaRepository;
import dio.academiaDigital.project.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IAlunoService {

    @Autowired
    private MatriculaRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        return null;
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public List<Aluno> getAll() {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        return null;
    }
}
