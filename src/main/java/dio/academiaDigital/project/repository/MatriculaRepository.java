package dio.academiaDigital.project.repository;

import dio.academiaDigital.project.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}
