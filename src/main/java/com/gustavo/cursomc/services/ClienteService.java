package com.gustavo.cursomc.services;

import com.gustavo.cursomc.domain.Cliente;
import com.gustavo.cursomc.repositories.CategoriaRepository;
import com.gustavo.cursomc.repositories.ClienteRepository;
import com.gustavo.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente find(Integer id) {
        Cliente obj = repo.findOne(id);

        if(obj == null) {
            throw new ObjectNotFoundException("Objeto com Id: " + id + " não encontrado!"
                                        + "Tipo: " + Cliente.class.getName());
        }
        return obj;
    }
}
