package com.dio.academiadigital.service.impl;

import com.dio.academiadigital.entity.Aluno;
import com.dio.academiadigital.entity.AvaliacaoFisica;
import com.dio.academiadigital.entity.form.AvaliacaoFisicaForm;
import com.dio.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;
import com.dio.academiadigital.repositories.AlunoRepository;
import com.dio.academiadigital.repositories.AvaliacaoFisicaRepository;
import com.dio.academiadigital.service.IAvaliacaoFisicaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author clesio
 */
@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {
    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;
    
    @Autowired
    private AlunoRepository alunoRepository;
    

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
     AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
     Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
     avaliacaoFisica.setAluno(aluno);
     avaliacaoFisica.setPeso(form.getPeso());
     avaliacaoFisica.setAltura(form.getAltura());
     
     
     return avaliacaoFisicaRepository.save(avaliacaoFisica);
     
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
