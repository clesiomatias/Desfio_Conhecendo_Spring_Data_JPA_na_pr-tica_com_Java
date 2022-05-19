package com.dio.academiadigital.service.impl;

import com.dio.academiadigital.entity.Aluno;
import com.dio.academiadigital.entity.AvaliacaoFisica;
import com.dio.academiadigital.entity.form.AlunoForm;
import com.dio.academiadigital.entity.form.AlunoUpdateForm;
import com.dio.academiadigital.infra.utils.JavaTimeUtils;
import com.dio.academiadigital.repositories.AlunoRepository;
import com.dio.academiadigital.service.IAlunoService;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author clesio
 */
@Service
public class AlunoServiceImpl implements IAlunoService{
    @Autowired
    private AlunoRepository repository;
    

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());
        
        return repository.save(aluno);
        
    }

    @Override
    public Aluno get(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Aluno> getAll(String dataDeNascimento) {
        if(dataDeNascimento==null){
            
        return repository.findAll();
        }else{
            LocalDate localDate = LocalDate.parse(dataDeNascimento,JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return repository.findByDataDeNascimento(localDate);
        }
           
        
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        Aluno aluno=repository.findById(id).get();
        
        return aluno.getAvaliacoes();
    }

}
