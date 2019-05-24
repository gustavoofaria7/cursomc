package com.gustavo.cursomc.domain;

import com.gustavo.cursomc.domain.enums.EstadoPagamento;

import javax.persistence.Entity;

@Entity
public class PagamentoComCartao extends Pagamento{

    private Integer numeroDeParcela;

    public PagamentoComCartao(){
    }

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcela) {
        super(id, estado, pedido);
        this.numeroDeParcela = numeroDeParcela;
    }

    public Integer getNumeroDeParcela() {
        return numeroDeParcela;
    }

    public void setNumeroDeParcela(Integer numeroDeParcela) {
        this.numeroDeParcela = numeroDeParcela;
    }
}
