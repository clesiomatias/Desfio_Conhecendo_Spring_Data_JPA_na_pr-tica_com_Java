package com.dio.academiadigital.repositories;

import com.dio.academiadigital.entity.Aluno;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author clesio
 */
@Repository
public interface AlunoRepository extends JpaRepository<Aluno,Long>{
    
    List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);

}
