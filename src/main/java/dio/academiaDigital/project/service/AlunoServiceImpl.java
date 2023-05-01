package dio.academiaDigital.project.service;

import dio.academiaDigital.project.entity.Aluno;
import dio.academiaDigital.project.entity.form.AlunoForm;
import dio.academiaDigital.project.entity.form.AlunoUpdateForm;
import dio.academiaDigital.project.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository repository;
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
}
