package com.dio.academiadigital.service.impl;

import com.dio.academiadigital.entity.Aluno;
import com.dio.academiadigital.entity.Matricula;
import com.dio.academiadigital.entity.form.MatriculaForm;
import com.dio.academiadigital.repositories.AlunoRepository;
import com.dio.academiadigital.repositories.MatriculaRepository;
import com.dio.academiadigital.service.IMatriculaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author clesio
 */
@Service
public class MatriculaServiceImpl implements IMatriculaService{
    
   @Autowired
  private MatriculaRepository repository;

  @Autowired
  private AlunoRepository alunoRepository;

  @Override
  public Matricula create(MatriculaForm form) {
    Matricula matricula = new Matricula();
    Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

    matricula.setAluno(aluno);

    return repository.save(matricula);
  }

  @Override
  public Matricula get(Long id) {
    return repository.findById(id).get();
  }

  @Override
  public List<Matricula> getAll(String bairro) {

    if(bairro == null){
      return repository.findAll();
    }else{
      return repository.findAlunosMatriculadosBairro(bairro);
    }

  }

  @Override
  public void delete(Long id) {}




    
    

}
