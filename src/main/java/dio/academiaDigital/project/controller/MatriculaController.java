package dio.academiaDigital.project.controller;

import dio.academiaDigital.project.entity.Matricula;
import dio.academiaDigital.project.entity.form.MatriculaForm;
import dio.academiaDigital.project.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;

    @GetMapping
    public List<Matricula> getAll() { return service.getAll(); };

    @PostMapping
    public Matricula create(@RequestBody MatriculaForm form) {
        return service.create(form);
    }
}
