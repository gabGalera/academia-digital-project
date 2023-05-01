package dio.academiaDigital.project.controller;

import dio.academiaDigital.project.entity.Aluno;
import dio.academiaDigital.project.service.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll() {
        return service.getAll();
    }
}
