package com.dio.academiadigital.controller;

import com.dio.academiadigital.entity.Matricula;
import com.dio.academiadigital.entity.form.MatriculaForm;
import com.dio.academiadigital.service.impl.MatriculaServiceImpl;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    
    @Autowired
    private  MatriculaServiceImpl service;
    
    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form){return service.create(form); }
    
    @GetMapping 
    public List<Matricula> getAll(@RequestParam(value="bairro", required=false) String bairro){return service.getAll(bairro);}

}

