package com.finalfds.cidareira.aplicacao.CasosDeUso;

import com.finalfds.cidareira.aplicacao.modelos.requisicao.AbrirReclamacaoReq;
import com.finalfds.cidareira.aplicacao.modelos.respostas.ReclamacaoRes;
import com.finalfds.cidareira.aplicacao.servicos.ServicoReclamacaoApp;
import org.springframework.stereotype.Component;

@Component
public class AbrirReclamacao{
    private ServicoReclamacaoApp servicoReclamacaoaApp;

    public AbrirReclamacao(ServicoReclamacaoApp servicoReclamacaoaApp){
        this.servicoReclamacaoaApp = servicoReclamacaoaApp;
    }

    public ReclamacaoRes run(AbrirReclamacaoReq requisicao){
        return servicoReclamacaoaApp.AbrirReclamacao(requisicao, new ReclamacaoRes());
    }
}