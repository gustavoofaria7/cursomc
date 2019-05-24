package com.gustavo.cursomc.repositories;

import com.gustavo.cursomc.domain.Cidade;
import com.gustavo.cursomc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
