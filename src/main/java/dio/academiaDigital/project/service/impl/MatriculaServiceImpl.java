package dio.academiaDigital.project.service.impl;

import dio.academiaDigital.project.entity.Aluno;
import dio.academiaDigital.project.entity.Matricula;
import dio.academiaDigital.project.entity.form.MatriculaForm;
import dio.academiaDigital.project.repository.AlunoRepository;
import dio.academiaDigital.project.repository.MatriculaRepository;
import dio.academiaDigital.project.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;


    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return matriculaRepository.findById(id).get();
    }

    @Override
    public List<Matricula> getAll() {
        return matriculaRepository.findAll();
    }

    @Override
    public void delete(long id) {

    }
}
