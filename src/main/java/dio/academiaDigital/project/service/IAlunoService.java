package dio.academiaDigital.project.service;

import dio.academiaDigital.project.entity.Aluno;
import dio.academiaDigital.project.entity.AvaliacaoFisica;
import dio.academiaDigital.project.entity.form.AlunoForm;
import dio.academiaDigital.project.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {

    Aluno create(AlunoForm form);
    Aluno get(Long id);
    Aluno update(Long id, AlunoUpdateForm formUpdate);
    List<Aluno> getAll();
    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);

}
