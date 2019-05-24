package com.gustavo.cursomc.services;

import com.gustavo.cursomc.domain.Pedido;
import com.gustavo.cursomc.repositories.PedidoRepository;
import com.gustavo.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido buscar(Integer id) {
        Pedido obj = repo.findOne(id);

        if(obj == null) {
            throw new ObjectNotFoundException("Objeto com Id: " + id + " não encontrado!"
                                        + "Tipo: " + Pedido.class.getName());
        }
        return obj;
    }
}
