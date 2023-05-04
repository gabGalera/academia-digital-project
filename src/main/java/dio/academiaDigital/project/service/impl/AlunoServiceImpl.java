package dio.academiaDigital.project.service.impl;

import dio.academiaDigital.project.entity.Aluno;
import dio.academiaDigital.project.entity.AvaliacaoFisica;
import dio.academiaDigital.project.entity.Matricula;
import dio.academiaDigital.project.entity.form.AlunoForm;
import dio.academiaDigital.project.entity.form.AlunoUpdateForm;
import dio.academiaDigital.project.infra.utils.JavaTimeUtils;
import dio.academiaDigital.project.repository.AlunoRepository;
import dio.academiaDigital.project.repository.MatriculaRepository;
import dio.academiaDigital.project.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository repository;

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        Aluno aluno = repository.findById(id).get();

        aluno.setId(id);
        aluno.setNome(formUpdate.getNome());
        aluno.setBairro(formUpdate.getBairro());
        aluno.setDataDeNascimento(formUpdate.getDataDeNascimento());

        Matricula matricula = matriculaRepository.findByAlunoId(id);
        if(matricula != null) {
            matricula.setAluno(aluno);

            matriculaRepository.deleteById(matricula.getId());
            repository.deleteById(id);
            repository.save(aluno);
            matriculaRepository.save(matricula);

            return aluno;
        } else {
            repository.deleteById(id);
            return repository.save(aluno);
        }
    }

    @Override
    public List<Aluno> getAll(String dataDeNascimento) {

        if(dataDeNascimento == null) {
            return repository.findAll();
        } else {
            LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return repository.findByDataDeNascimento(localDate);
        }
    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {

        Aluno aluno = repository.findById(id).get();

        return aluno.getAvaliacoes();
    }
}
