package com.gustavo.cursomc.repositories;

import com.gustavo.cursomc.domain.Cliente;
import com.gustavo.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
