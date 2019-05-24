package com.gustavo.cursomc.repositories;

import com.gustavo.cursomc.domain.Estado;
import com.gustavo.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
