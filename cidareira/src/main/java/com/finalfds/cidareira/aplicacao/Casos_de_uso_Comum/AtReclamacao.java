package com.finalfds.cidareira.aplicacao.Casos_de_uso_Comum;

import com.finalfds.cidareira.negocio.entidades.*;
import com.finalfds.cidareira.negocio.entidades.enums.Categoria;
import com.finalfds.cidareira.negocio.servicos.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtReclamacao {
    private ServicoReclamacao servicoReclamacao;

    @Autowired
    public AtReclamacao(ServicoReclamacao servicoReclamacao){
        this.servicoReclamacao = servicoReclamacao;
    }

    public Reclamacao run(Long id, String titulo, String descricao, String status, Usuario usuario, Categoria categoria, Endereco endereco){
        return servicoReclamacao.
    }
}
