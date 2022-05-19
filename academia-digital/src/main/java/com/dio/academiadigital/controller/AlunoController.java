package com.dio.academiadigital.controller;

import com.dio.academiadigital.entity.Aluno;
import com.dio.academiadigital.entity.AvaliacaoFisica;
import com.dio.academiadigital.entity.form.AlunoForm;
import com.dio.academiadigital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoServiceImpl service;

       
    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form){
        return service.create(form) ;
    }
    
    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacoesFisicas(@PathVariable Long id){
        return service.getAllAvaliacaoFisicaId(id);
    
}
    @GetMapping
    public List<Aluno> getAll(@RequestParam (value="dataDeNascimento",required=false) String dataDeNascimento){
        return service.getAll(dataDeNascimento);
    }
    
    
    

}
