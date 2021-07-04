package com.finalfds.cidareira.aplicacao.Casos_de_uso_Comum;

import com.finalfds.cidareira.adaptadores.controllers.ReclamacoesController;
import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioComentarios;
import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioReclamacoes;
import com.finalfds.cidareira.negocio.entidades.*;
import com.finalfds.cidareira.negocio.servicos.ServicoReclamacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AbrirReclamacaoUC{
    private ServicoReclamacao servicoReclamacao;

    @Autowired
    public AbrirReclamacaoUC(ServicoReclamacao servicoReclamacao){
        this.servicoReclamacao = servicoReclamacao;
    }

    public void run(Reclamacao reclamacao){
        servicoReclamacao.registrarReclamacao(reclamacao);
    }
}