package com.finalfds.cidareira.aplicacao.servicos;

import org.springframework.stereotype.Service;

@Service
public class ReportarServico {
    private ServicoReclamacaoApp servicoReclamacaoApp;
    private ServicoComentariosApp servicoComentariosApp;
    private ServicoUsuariosApp servicoUsuariosApp;

    public ReportarServico(ServicoReclamacaoApp servicoReclamacaoApp, ServicoComentariosApp servicoComentariosApp, ServicoUsuariosApp servicoUsuariosApp){
        this.servicoReclamacaoApp = servicoReclamacaoApp;
        this.servicoComentariosApp = servicoComentariosApp;
        this.servicoUsuariosApp = servicoUsuariosApp;
    }

    //public List
}
