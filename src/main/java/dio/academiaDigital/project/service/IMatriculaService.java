package dio.academiaDigital.project.service;

import dio.academiaDigital.project.entity.Matricula;

import java.util.List;

public interface IMatriculaService {
//    Matricula create(MatriculaForm form);
    Matricula get(Long id);
    List<Matricula> getAll();
    void delete(long id);
}

