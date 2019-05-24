package com.gustavo.cursomc.services;

import com.gustavo.cursomc.domain.Categoria;
import com.gustavo.cursomc.repositories.CategoriaRepository;
import com.gustavo.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id) {
        Categoria obj = repo.findOne(id);

        if(obj == null) {
            throw new ObjectNotFoundException("Objeto com Id: " + id + " não encontrado!"
                                        + "Tipo: " + Categoria.class.getName());
        }
        return obj;
    }

    public Categoria insert(Categoria obj) {
        obj.setId(null);
        return repo.save(obj);
    }

    public Categoria update(Categoria obj) {
        return repo.save(obj);
    }
}
