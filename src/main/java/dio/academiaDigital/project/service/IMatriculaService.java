package dio.academiaDigital.project.service;

import dio.academiaDigital.project.entity.Matricula;
import dio.academiaDigital.project.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {
    Matricula create(MatriculaForm form);
    Matricula get(Long id);
    List<Matricula> getAll(String bairro);
    void delete(long id);
}

