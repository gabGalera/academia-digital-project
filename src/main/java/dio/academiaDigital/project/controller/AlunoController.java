package dio.academiaDigital.project.controller;

import dio.academiaDigital.project.entity.Aluno;
import dio.academiaDigital.project.entity.AvaliacaoFisica;
import dio.academiaDigital.project.entity.form.AlunoForm;
import dio.academiaDigital.project.service.impl.AlunoServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false)
                                  String dataDeNascimento) {
        return service.getAll(dataDeNascimento);
    }

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form) {
        return service.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id) {
        return service.getAllAvaliacaoFisicaId(id);
    }

    @GetMapping("/{id}")
    public Aluno get(@PathVariable Long id) {
        return service.get(id);
    }
}
