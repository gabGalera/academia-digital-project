package dio.academiaDigital.project.service;

import dio.academiaDigital.project.entity.Aluno;
import dio.academiaDigital.project.entity.form.AlunoForm;

import java.util.List;

public interface IAlunoService {

    Aluno create(AlunoForm form);
    Aluno get(Long id);
    List<Aluno> getAll();
}
