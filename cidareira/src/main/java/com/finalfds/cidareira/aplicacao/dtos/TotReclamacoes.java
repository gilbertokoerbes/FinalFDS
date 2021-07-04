package com.finalfds.cidareira.aplicacao.dtos;

import java.util.List;

import com.finalfds.cidareira.negocio.entidades.*;
import com.finalfds.cidareira.negocio.servicos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TotReclamacoes {


    private ServicoReclamacao servicoReclamacao;

    @Autowired
    public TotReclamacoes(ServicoReclamacao servicoReclamacao){
        this.servicoReclamacao =  servicoReclamacao;

    }

    public List<Reclamacao> run(){
        return this.servicoReclamacao.getAllReclamacao();
    }
}
