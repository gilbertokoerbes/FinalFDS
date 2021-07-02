package com.finalfds.cidareira.aplicacao.dtos;

import java.util.List;

import com.finalfds.cidareira.negocio.entidades.*;
import com.finalfds.cidareira.negocio.servicos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TotReclamacoes {
    @Autowired
    private ServicoReclamacao servicoReclamacao;

    public List<Reclamacao> run(){
        return this.servicoReclamacao.getAllReclamacao();
    }
}
